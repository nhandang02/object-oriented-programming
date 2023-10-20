public abstract class KhachHang {
    protected String MKH;
    protected String Ten;
    protected String gioiTinh;
    protected String diaChi;
    protected int soLuong;
    protected double giaBan;

    public KhachHang( String MKH, String Ten, String gioiTinh, String diaChi, int soLuong, double giaBan) {
        this.MKH = MKH;
        this.Ten = Ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public String getMKH() {
        return this.MKH;
    }
    public String getTen() {
        return this.Ten;
    }
    public String getGioiTinh() {
        return this.gioiTinh;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    public int getSoLuong() {
        return this.soLuong;
    }
    public double getGiaBan() {
        return this.giaBan;
    }

    public abstract double ThanhTien();
    public abstract String toString();
}