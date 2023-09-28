public class DangThanhNhan_FractionArr implements DangThanhNhan_FractionI {
    // Data members
    private int[] members;
    // Constructors
    public DangThanhNhan_FractionArr() { this(1,1); }
    public DangThanhNhan_FractionArr(int numer, int denom) {
    members = new int[2];
    setNumer(numer);
    setDenom(denom);
    }
    // Accessors
    public int getNumer() {
        return this.members[0];
    }
    public int getDenom() {
        return this.members[1];
    }
    // Mutators
    public void setNumer(int numer) {
        this.members[0] = numer;
    }
    public void setDenom(int denom) {
        this.members[1] = denom;
    }
    public DangThanhNhan_FractionI simplify() {
        int gcd = gcd(members[0], members[1]); 
        int numer = members[0] / gcd; 
        int denom = members[1] / gcd;
        return new DangThanhNhan_FractionArr(numer, denom);
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

    public DangThanhNhan_FractionI add(DangThanhNhan_FractionI f) {
        int numer = members[0] * f.getDenom() + f.getNumer() * members[1]; 
        int denom = members[1] * f.getDenom(); 
        return new DangThanhNhan_FractionArr(numer, denom).simplify(); 
    }

    public DangThanhNhan_FractionI minus(DangThanhNhan_FractionI f) {
        int numer = members[0] * f.getDenom() - f.getNumer() * members[1]; 
        int denom = members[1] * f.getDenom(); 
        return new DangThanhNhan_FractionArr(numer, denom).simplify();
    }

    public DangThanhNhan_FractionI times(DangThanhNhan_FractionI f) {
        int numer = members[0] * f.getNumer(); 
        int denom = members[1] * f.getDenom(); 
        return new DangThanhNhan_FractionArr(numer, denom).simplify();
    }

    // Overriding methods toString() and equals()
    public String toString() {
            if (members[0] == 0) {
            return "0";  
        } else if (members[1] == 1) {
            return Integer.toString(members[0]);  
        } else {
            return members[0] + "/" + members[1];  
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DangThanhNhan_FractionArr)
        {
            DangThanhNhan_FractionArr temp = (DangThanhNhan_FractionArr) obj;
            if (this.members[0] == temp.getNumer() && this.members[1] == temp.getDenom())
            {
                return true;
            }
        }
        return false;
    }
}