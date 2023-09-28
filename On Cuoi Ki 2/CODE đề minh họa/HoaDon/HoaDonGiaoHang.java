public class HoaDonGiaoHang extends HoaDon {
    private String diaChi;
    private double khoangCach;
    private int thoiGianGiao;

    public HoaDonGiaoHang() {
        super();
        this.diaChi = "Q.TanPhu";
        this.khoangCach = 20;
        this.thoiGianGiao = 24;
    }

    public double tinhTongTien() {
        if (thoiGianGiao < 24) {
            if (khoangCach < 10) return 20 * khoangCach * soLuong + super.tinhThanhTien();
            else return 18 * khoangCach * soLuong + super.tinhThanhTien();
        }
        else {
            return 150000 + super.tinhThanhTien();
        }
    }

    public String xuatThongTin() {
        return super.xuatThongTin() + "," + tinhTongTien();
    }
}