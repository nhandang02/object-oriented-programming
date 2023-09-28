class FractionArr implements FractionI {
    // Data members
    private int[] members;
    // Constructors
    public FractionArr() { this(1,1); }
    public FractionArr(int numer, int denom) {
    members = new int[2];
    setNumer(numer);
    setDenom(denom);
    }
    // Accessors
    public int getNumer() {
        return this.numer
    }
    public int getDenom() {
        return this.denom
    }
    // Mutators
    public void setNumer(int numer) {
        this.numer = numer;
    }
    public void setDenom(int denom) {
        this.denom = denom;
    }
    // The rest are omitted here
}