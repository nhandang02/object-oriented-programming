public class ConvenientCard implements Payment{
	// code here
    private String type;
	private IDCard thedinhdanh;
	private double sodutaikhoan;

	public ConvenientCard(IDCard thedinhdanh) throws CannotCreateCard {
		this.thedinhdanh = thedinhdanh;
		this.sodutaikhoan = 100;
		int tuoi = getTuoitheothedinhdanh();
		if (tuoi < 12) throw new CannotCreateCard("Not enough age");
		else if (tuoi <= 18) this.type = "Student";
		else this.type = "Adult";
	}
	public int getTuoitheothedinhdanh() {
		String [] ngaythangnamsinh = (thedinhdanh.getNgaythangnamsinh()).split("/");
		int namsinh = Integer.parseInt(ngaythangnamsinh[2]);
		int tuoi = 2023 - namsinh;
		return tuoi;
	}
	
	public String getType() {
		return this.type;
	}
	public int getSoDinhDanh() {
		return thedinhdanh.sodinhdanh;
	}
	public int getSdt() {
		return thedinhdanh.sdt;
	}
	public String getGioiTinh() {
		return thedinhdanh.gioitinh;
	}

	public boolean pay(double amount) {
		double sotiencanthanhtoan = 0;
		if (this.getType().equals("Student")){
			sotiencanthanhtoan = amount;
		}
		else if (this.getType().equals("Adult")) {
			sotiencanthanhtoan = amount * 1.01;
		}
		
		if (sotiencanthanhtoan <= sodutaikhoan) {
			sodutaikhoan = sodutaikhoan - sotiencanthanhtoan;
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
		return thedinhdanh + "," + this.type + "," + this.sodutaikhoan;
	}
}
