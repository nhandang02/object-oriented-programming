public class HoaDon {
    protected String maHoaDon;
    protected String ngayLapHoaDon;
    protected String nguoiBan;
    protected String nguoiMua;
    protected String tenSanPham;
    protected int soLuong;
    protected double donGia;

    public HoaDon() {
        this.maHoaDon = "HD001";
        this.nguoiBan = "Nguyen Hoang";
        this.nguoiMua = "Dang Thanh Nhan";
        this.tenSanPham = "But bi Thien Long";
        this.soLuong = 20;
        this.donGia = 2500;
    }

    public double tinhThanhTien() {
        if (soLuong > 1000) return soLuong*donGia*0.96;
        else return soLuong*donGia;
    }

    public double tinhThue() {
        return 0.1*this.tinhThanhTien();
    }

    public double tinhTongTien() {
        return this.tinhThanhTien() - this.tinhThue();
    }

    public String xuatThongTin() {
        return maHoaDon + "," + tenSanPham + "," + nguoiMua + "," + soLuong + "," + donGia + "," 
                        + this.tinhThanhTien() + "," + this.tinhThue() + "," + this.tinhTongTien();
    }

}