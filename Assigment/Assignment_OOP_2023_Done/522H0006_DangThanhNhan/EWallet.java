public class EWallet implements Payment, Transfer {
	// code here
	private int sdt;
	private double sodutaikhoan;
	private double soTienDaTra;

	public EWallet(int sdt) {
		this.sdt = sdt;
		this.sodutaikhoan = 0;
	}

	public int getSdt() {
		return this.sdt;
	}
	public double getSoTienDaTra() {
        return this.soTienDaTra;
    }
    public void setSoTienDaTra(double tien) {
        this.soTienDaTra = tien;
    }

	public boolean pay(double amount) {
		double sotiencanthanhtoan = amount;

		if (sotiencanthanhtoan <= sodutaikhoan) {
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
		
		if (sotienchuyen <= sodutaikhoan) {
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
		return this.sdt + "," + this.sodutaikhoan;
	}
}
