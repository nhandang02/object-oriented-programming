public class KhachHangVIP extends KhachHang {
    private String loaiVip;
    public KhachHangVIP( String MKH, String Ten, String gioiTinh, String diaChi, int soLuong, double giaBan, String loaiVip) {
        super(MKH,Ten,gioiTinh,diaChi,soLuong,giaBan);
        this.loaiVip = loaiVip;
    }

    public double ThanhTien() {
        return (giaBan-10) * soLuong * 0.93;
    }

    public String toString() {
        return "KhachHangThanThiet[" + this.MKH + "," + this.Ten + "," + this.gioiTinh + ","
                        + this.diaChi + "," + this.soLuong + "," + this.giaBan + "," + this.loaiVip + "," + this.ThanhTien() + "]";
    }
}