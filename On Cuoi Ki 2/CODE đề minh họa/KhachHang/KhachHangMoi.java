public class KhachHangMoi extends KhachHang {

    public KhachHangMoi( String MKH, String Ten, String gioiTinh, String diaChi, int soLuong, double giaBan) {
        super(MKH,Ten,gioiTinh,diaChi,soLuong,giaBan);
    }

    public double ThanhTien() {
        return soLuong * giaBan;
    }

    public String toString() {
        return "KhachHangMoi[" + this.MKH + "," + this.Ten + "," + this.gioiTinh + ","
                        + this.diaChi + "," + this.soLuong + "," + this.giaBan + "," + this.ThanhTien() + "]";
    }
}