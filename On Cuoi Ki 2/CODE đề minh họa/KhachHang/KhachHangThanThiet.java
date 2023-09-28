public class KhachHangThanThiet extends KhachHang {
    private double tongTienDaMua;

    public KhachHangThanThiet( String MKH, String Ten, String gioiTinh, String diaChi, int soLuong, double giaBan, double tongTienDaMua) {
        super(MKH,Ten,gioiTinh,diaChi,soLuong,giaBan);
        this.tongTienDaMua = tongTienDaMua;
    }

    public double ThanhTien() {
        double tongTien;
        if (soLuong > 30) {
            int x = soLuong % 30;
            if (x != 0) {
                int y = soLuong - x;
                int z = y / 30;
                tongTien = (x + (soLuong-x-z)) * giaBan * 0.95;
            }
            else {
                int y = soLuong / 30;
                tongTien = (soLuong-y)*giaBan*0.95;
            }
        }
        else tongTien = soLuong*giaBan*0.95;
        this.setTongTienDaMua(tongTien);
        return tongTien;
    }

    public double getTongTienDaMua() {
        return this.tongTienDaMua;
    }
    public void setTongTienDaMua(double tien) {
        this.tongTienDaMua += tien;
    }

    public String toString() {
        return "KhachHangThanThiet[" + this.MKH + "," + this.Ten + "," + this.gioiTinh + ","
                        + this.diaChi + "," + this.soLuong + "," + this.giaBan + "," + this.tongTienDaMua + "," + this.ThanhTien() + "]";
    }
}