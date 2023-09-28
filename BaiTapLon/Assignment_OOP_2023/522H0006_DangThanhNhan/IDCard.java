public class IDCard {
      protected int sodinhdanh;
      protected  String hoten;
      protected  String gioitinh;
      protected  String ngaythangnamsinh;
      protected  String diachi;
      protected  int sdt;

      public IDCard(int sodinhdanh, String hoten, String gioitinh, String ngaythangnamsinh, String diachi, int sdt) {
            this.sodinhdanh = sodinhdanh;
            this.hoten = hoten;
            this.gioitinh = gioitinh;
            this.ngaythangnamsinh = ngaythangnamsinh;
            this.diachi = diachi;
            this.sdt = sdt; 
      }

      public int getSoDinhDanh() {
            return this.sodinhdanh;
      }
      public void setSodinhdanh(int sodinhdanh) {
            this.sodinhdanh = sodinhdanh;
      }

      public String getHoten() {
            return this.hoten;
      }
      public void setHoten(String hoten) {
            this.hoten = hoten;
      }

      public String getGioitinh() {
            return this.gioitinh;
      }
      public void setGioitinh(String gioitinh) {
            this.gioitinh = gioitinh;
      }

      public String getNgaythangnamsinh() {
            return this.ngaythangnamsinh;
      }
      public void setNgaythangnamsinh(String ngaythangnamsinh) {
            this.ngaythangnamsinh = ngaythangnamsinh;
      }

      public String getDiachi() {
            return this.diachi;
      }
      public void setDiachi(String diachi) {
            this.diachi = diachi;
      }

      public int getSdt() {
            return this.sdt;
      }
      public void setSdt(int sdt) {
            this.sdt = sdt;
      }

      public String toString() {
            return sodinhdanh + "," + hoten + "," + gioitinh + "," + ngaythangnamsinh + "," + diachi + "," + sdt;
      }
}
