public interface DangThanhNhan_FractionI {
    public int getNumer(); //returns numerator part
    public int getDenom(); //returns denominator part
    public void setNumer(int numer); //sets new numerator
    public void setDenom(int denom); //sets new denominator
    public DangThanhNhan_FractionI add(DangThanhNhan_FractionI f); //returns this + f
    public DangThanhNhan_FractionI minus(DangThanhNhan_FractionI f); //returns this - f
    public DangThanhNhan_FractionI times(DangThanhNhan_FractionI f); //returns this * f
    public DangThanhNhan_FractionI simplify(); //returns this simplified
}