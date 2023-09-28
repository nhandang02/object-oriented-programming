import java.util.*;
import java.io.*;

public class TransactionProcessing {
    private ArrayList<Payment> paymentObjects;
    private IDCardManagement idcm;
    private ArrayList<ConvenientCard> AdultConvenientCards;
    ArrayList<IDCard> CustomersHaveBoth;
    private ArrayList<Bill> UnsuccessfulTransactions;
    private ArrayList<BankAccount> SuccessfulTransactionsBA;
    private ArrayList<BankAccount> MaxPayment;
    
    public TransactionProcessing(String idCardPath, String paymentPath) {
        idcm = new IDCardManagement(idCardPath);
        readPaymentObject(paymentPath);
    
    }

    public ArrayList<Payment> getPaymentObject() {
        return this.paymentObjects;
    }

    // Requirement 3
    public void addCC(String line) {
        ArrayList<IDCard> idList = idcm.getIDCards();
        for (IDCard idc : idList) {
            String sdd = Integer.toString(idc.getSoDinhDanh());
            if (line.equals(sdd)) {
                try {
                    ConvenientCard taikhoan = new ConvenientCard(idc);
                    paymentObjects.add(taikhoan);
                    if (taikhoan.getType() == "Adult")  AdultConvenientCards.add(taikhoan);
                } catch (CannotCreateCard e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addEW(String line) {
        int sdt = Integer.parseInt(line);
        EWallet taikhoan = new EWallet(sdt);
        paymentObjects.add(taikhoan);
    }

    public void addBA(String line) {
        String[] parts = line.split(",");
        int stk = Integer.parseInt(parts[0]);
        double tilelaisuat = Double.parseDouble(parts[1]);
        BankAccount taikhoan = new BankAccount(stk, tilelaisuat);
        paymentObjects.add(taikhoan);
    }

    public boolean readPaymentObject(String path) {
        //code here
        try {
            paymentObjects = new ArrayList<Payment>();
            AdultConvenientCards = new ArrayList<ConvenientCard>();
            File inputFile = new File(path);
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.length() == 6) {
                    addCC(line);
                }
                else if (line.length() == 7) {
                    addEW(line);
                }    
                else {
                    addBA(line); 
                }
            }
            sc.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Requirement 4
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        //code here
        return this.AdultConvenientCards;
    }

    // Requirement 5
    public ArrayList<IDCard> getCustomersHaveBoth() {
        //code here
        CustomersHaveBoth = new ArrayList<>();
        ArrayList<IDCard> idcards = idcm.getIDCards();

        for (IDCard idc : idcards) {
            for (Payment ob1 : paymentObjects) {
                if (ob1 instanceof ConvenientCard) {
                    ConvenientCard cc = (ConvenientCard) ob1;
                    if (cc.getSoDinhDanh() == idc.getSoDinhDanh()) {
                        for (Payment ob2 : paymentObjects) {
                            if (ob2 instanceof BankAccount) {
                                BankAccount ba = (BankAccount) ob2;
                                if (cc.getSoDinhDanh() == ba.getSoTaiKhoan()) {
                                    for (Payment ob3 : paymentObjects) {
                                        if (ob3 instanceof EWallet) {
                                            EWallet ew = (EWallet) ob3;
                                            if (cc.getSdt() == ew.getSdt()) {
                                            CustomersHaveBoth.add(idc); 
                                            }   
                                        }    
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return CustomersHaveBoth;
    }

    // Requirement 6
    public void topUpCC(int Stk, double tienNap) {
        for (Payment ob : paymentObjects) {
            if (ob instanceof ConvenientCard) {
                ConvenientCard cc = (ConvenientCard) ob;
                if (cc.getSoDinhDanh() == Stk) {
                    cc.topUp(tienNap);
                }
            }
        }
    }

    public void topUpEW(int Stk, double tienNap) {
        for (Payment ob : paymentObjects) {
            if (ob instanceof EWallet) {
                EWallet ew = (EWallet) ob;
                if (ew.getSdt() == Stk) {
                    ew.topUp(tienNap);
                }
            }
        }
    }

    public void topUpBA(int Stk, double tienNap) {
        for (Payment ob : paymentObjects) {
            if (ob instanceof BankAccount) {
                BankAccount ba = (BankAccount) ob;
                if (ba.getSoTaiKhoan() == Stk) {
                    ba.topUp(tienNap);
                }
            }
        }
    }

    public void processTopUp(String path) {
        //code here
        try {
            File inputFile = new File(path);
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String loaiTaiKhoan = parts[0];
                int Stk = Integer.parseInt(parts[1]);
                double tienNap = Double.parseDouble(parts[2]);

                if (loaiTaiKhoan.equals("CC")) {
                    topUpCC(Stk, tienNap);
                }
                else if (loaiTaiKhoan.equals("EW")) {
                    topUpEW(Stk, tienNap);
                }    
                else {
                    topUpBA(Stk, tienNap); 
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        //code here
        try {
            File inputFile = new File(path);
            Scanner sc = new Scanner(inputFile);
            UnsuccessfulTransactions = new ArrayList<Bill>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                int Stt = Integer.parseInt(parts[0]);
                double tienThanhToan = Double.parseDouble(parts[1]);
                String loaiHang = parts[2];
                String loaiTaiKhoan = parts[3];
                int Stk = Integer.parseInt(parts[4]);

                if (loaiTaiKhoan.equals("CC")) {
                    for (Payment ob : paymentObjects) {
                        if (ob instanceof ConvenientCard) {
                            ConvenientCard cc = (ConvenientCard) ob; 
                            if (Stk == cc.getSoDinhDanh()) {
                                if (cc.pay(tienThanhToan) == false) {
                                    Bill element = new Bill(Stt, tienThanhToan, loaiHang);
                                    UnsuccessfulTransactions.add(element);
                                }   
                            }
                        }
                    }
                }

                else if (loaiTaiKhoan.equals("EW")) {
                    for (Payment ob : paymentObjects) {
                        if (ob instanceof EWallet) {
                            EWallet ew = (EWallet) ob; 
                            if (Stk == ew.getSdt()) {
                                if (ew.pay(tienThanhToan) == false) {
                                    Bill element = new Bill(Stt, tienThanhToan, loaiHang);
                                    UnsuccessfulTransactions.add(element);
                                }  
                            }
                        }
                    }
                }

                else {
                    for (Payment ob : paymentObjects) {
                        if (ob instanceof BankAccount) {
                            BankAccount ba = (BankAccount) ob; 
                            if (Stk == ba.getSoTaiKhoan()) {
                                if (ba.pay(tienThanhToan) == false) {
                                    Bill element = new Bill(Stt, tienThanhToan, loaiHang);
                                    UnsuccessfulTransactions.add(element);
                                }   
                            }
                        }
                    }
                }     
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return UnsuccessfulTransactions;
    }

    // Requirement 8
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {
        //code here
       try {
            File inputFile = new File(path);
            Scanner sc = new Scanner(inputFile);
            SuccessfulTransactionsBA = new ArrayList<BankAccount>();
            MaxPayment = new ArrayList<BankAccount>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                int stt = Integer.parseInt(parts[0]);
                double tienThanhToan = Double.parseDouble(parts[1]);
                String loaiHang = parts[2];
                String loaiTaiKhoan = parts[3];
                int Stk = Integer.parseInt(parts[4]);
                double tongTienTra = 0;

                if (loaiTaiKhoan.equals("BA")) {
                    for (Payment ob : paymentObjects) {
                        if (ob instanceof BankAccount) {
                            BankAccount ba = (BankAccount) ob; 
                            if (Stk == ba.getSoTaiKhoan()) {
                                if (ba.pay(tienThanhToan)) {
                                    SuccessfulTransactionsBA.add(ba);
                                    tongTienTra = ba.getSoTienDaTra();
                                    tongTienTra += tienThanhToan; 
                                    ba.setSoTienDaTra(tongTienTra);
                                }    
                            }
                        }
                    }
                }
            }
            sc.close();

            double soTienDaTraLonNhat = 0;
            int stk = 0;
            for (BankAccount ba : SuccessfulTransactionsBA) {
                if (ba.getSoTienDaTra() > soTienDaTraLonNhat) {
                    soTienDaTraLonNhat = ba.getSoTienDaTra();
                }
            }
            for (BankAccount ba : SuccessfulTransactionsBA) {
                if (ba.getSoTaiKhoan() != stk) {
                    if (ba.getSoTienDaTra() == soTienDaTraLonNhat) {
                        MaxPayment.add(ba);
                        stk = ba.getSoTaiKhoan(); 
                    }
                }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return MaxPayment;   
    }

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        //code here
        try {
            File inputFile = new File(path);
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                int stt = Integer.parseInt(parts[0]);
                double tienThanhToan = Double.parseDouble(parts[1]);
                String loaiHang = parts[2];
                String loaiTaiKhoan = parts[3];
                int Stk = Integer.parseInt(parts[4]);
                double tongTienTra = 0;

                if (loaiTaiKhoan.equals("CC")) {
                    for (Payment ob : paymentObjects) {
                        if (ob instanceof ConvenientCard) {
                            ConvenientCard cc = (ConvenientCard) ob; 
                            if (Stk == cc.getSoDinhDanh()) {
                                cc.pay(tienThanhToan); 
                            }
                        }
                    }
                }

                else if (loaiTaiKhoan.equals("EW")) {
                    for (Payment ob1 : paymentObjects) {
                        if (ob1 instanceof EWallet) {
                            EWallet ew = (EWallet) ob1;
                            if (ew.getSdt() == Stk) {
                                for (Payment ob2 : paymentObjects) {
                                    if (ob2 instanceof ConvenientCard) {
                                        ConvenientCard cc = (ConvenientCard) ob2;
                                        if (cc.getSdt() == ew.getSdt()) {
                                            if ((cc.getGioiTinh().equals("Male")) && (cc.getTuoitheothedinhdanh() < 20) &&
                                                (loaiHang.equals("Clothing")) && (tienThanhToan > 500)) {
                                                    tienThanhToan *= 0.85;
                                                    ew.pay(tienThanhToan);
                                            }
                                            else if ((cc.getGioiTinh().equals("Female")) && (cc.getTuoitheothedinhdanh() < 18) &&
                                                (loaiHang.equals("Clothing")) && (tienThanhToan > 500)) {
                                                    tienThanhToan *=  0.85;
                                                    ew.pay(tienThanhToan);
                                            }
                                        }
                                    }
                                }
                                ew.pay(tienThanhToan);
                            } 
                        }
                    }
                }

                else {
                    for (Payment ob : paymentObjects) {
                        if (ob instanceof BankAccount) {
                            BankAccount cv = (BankAccount) ob; 
                            if (Stk == cv.getSoTaiKhoan()) {
                                cv.pay(tienThanhToan);  
                            }
                        }
                    }
                }
            }
        sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }    
    }
}