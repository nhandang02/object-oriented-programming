public class DangThanhNhan_Fraction implements DangThanhNhan_FractionI {
    // Data members
    private int numer;
    private int denom;

    // Constructors
    public DangThanhNhan_Fraction() {
        this(1,1);
    }

    public DangThanhNhan_Fraction(int numer, int denom) {
        setNumer(numer);
        setDenom(denom);
    }

    // Accessors
    public int getNumer() {
        return this.numer;
    }

    public int getDenom() {
        return this.denom;
    }

    // Mutators
    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    private static int gcd(int a, int b) {
        int rem;
        while (b > 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public DangThanhNhan_FractionI simplify() {
        int GCD = gcd(numer, denom);
        return new DangThanhNhan_Fraction(this.numer/GCD, this.denom/GCD);
    }

    private int lcm(int a, int b) {
        int GCD = gcd(a, b);
        return (a * b) / GCD;
    }

    public DangThanhNhan_FractionI add(DangThanhNhan_FractionI f) {
        if (f instanceof DangThanhNhan_Fraction) {
            DangThanhNhan_Fraction f1 = (DangThanhNhan_Fraction) f;
            int LCM = lcm(this.denom, f1.denom);
            int newNumerator = this.numer * (LCM / this.denom) + f1.numer * (LCM / f1.denom);
            DangThanhNhan_Fraction result = new DangThanhNhan_Fraction(newNumerator, LCM);
            return result.simplify();
        } else {
            return null;
        }
    }

    public DangThanhNhan_FractionI minus(DangThanhNhan_FractionI f) {
        if (f instanceof DangThanhNhan_Fraction) {
            DangThanhNhan_Fraction f1 = (DangThanhNhan_Fraction) f;
            int LCM = lcm(this.denom, f1.denom);
            double newNumerator = this.numer * (LCM / this.denom) - f1.numer * (LCM / f1.denom);
            DangThanhNhan_Fraction result = new DangThanhNhan_Fraction((int)newNumerator, LCM);
            return result.simplify();
        } else {
            return null;
        }
    }
    public DangThanhNhan_FractionI times(DangThanhNhan_FractionI f) {
    if (f instanceof DangThanhNhan_Fraction) {
        DangThanhNhan_Fraction f1 = (DangThanhNhan_Fraction) f;
        int newNumerator = this.numer * f1.numer;
        int newDenominator = this.denom * f1.denom;
        DangThanhNhan_Fraction result = new DangThanhNhan_Fraction(newNumerator, newDenominator);
        return result.simplify();
    } else {
        return null;
    }
    }

    
    public String toString() {
            if (numer == 0) {
            return "0";  
        } else if (denom == 1) {
            return Integer.toString(numer);  
        } else {
            return numer + "/" + denom;  
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof DangThanhNhan_Fraction) {
            DangThanhNhan_Fraction f1 = (DangThanhNhan_Fraction) obj;
            this.simplify();
            f1.simplify();
            if (this.numer == f1.getNumer() && this.denom == f1.getDenom()) return true;
        }
        return false;
    }
}