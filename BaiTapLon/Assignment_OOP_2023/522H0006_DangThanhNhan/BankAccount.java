public class BankAccount implements Payment, Transfer{
    // code here
    private int sotaikhoan;
    private double tilelaisuat;
    private double sodutaikhoan;
    private double soTienDaTra;

    public BankAccount(int sotaikhoan, double tilelaisuat) {
        this.sotaikhoan = sotaikhoan;
        this.tilelaisuat = tilelaisuat;
        this.sodutaikhoan = 50;
    }

    public int getSoTaiKhoan() {
        return this.sotaikhoan;
    }
    public double getSoTienDaTra() {
        return this.soTienDaTra;
    }
    public void setSoTienDaTra(double tien) {
        this.soTienDaTra = tien;
    }

    public boolean pay(double amount) {
		double sotiencanthanhtoan = amount;

		if (sotiencanthanhtoan + 50 <= sodutaikhoan) {
			sodutaikhoan = sodutaikhoan - sotiencanthanhtoan;
			return true;
		}
		else return false;
	}

    public boolean transfer (double amount, Transfer to) {
		double sotienchuyen;
		double sotiennhan;

		sotienchuyen = amount + (transferFee * amount);
		sotiennhan = amount;
	
		if (sotienchuyen + 50 <= sodutaikhoan) {
			sodutaikhoan -= sotienchuyen;
            if (to instanceof EWallet) {
                EWallet taikhoandich = (EWallet) to;
                taikhoandich.topUp(sotiennhan);
            }
            else if (to instanceof BankAccount) {
                BankAccount taikhoandich = (BankAccount) to;
                taikhoandich.topUp(sotiennhan);
            }
			return true;
		}
		else return false;
	} 

    public double checkBalance() {
		return this.sodutaikhoan;
	}  

    public void topUp(double tiennap) {
		this.sodutaikhoan += tiennap;
	}

    public String toString() {
        return this.sotaikhoan + "," + this.tilelaisuat + "," + this.sodutaikhoan;
    }
}
