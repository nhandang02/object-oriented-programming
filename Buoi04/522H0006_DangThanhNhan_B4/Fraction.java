public class Fraction {
	public static void main(String [] args) {
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(3, 4);
		f1.add(f2);
		System.out.println(f1); 
		
		f1.sub(f2);
		System.out.println(f1); 

		f1.mul(f2);
		System.out.println(f1); 
		
		f1.div(f2);
		System.out.println(f1); 
	}

	private int numerator;
    	private int denominator;

    	public Fraction(int numerator, int denominator) {
     		if (denominator == 0) {
           	throw new IllegalArgumentException("Denominator cannot be zero");
        	}
        	this.numerator = numerator;
        	this.denominator = denominator;
       	reduce();
    	}

    	public Fraction(Fraction other) {
     		this.numerator = other.numerator;
        	this.denominator = other.denominator;
    	}

    	public void add(Fraction other) {
        	int lcm = getLCM(denominator, other.denominator);
        	numerator = numerator * (lcm / denominator) + other.numerator * (lcm / other.denominator);
        	denominator = lcm;
        	reduce();
    	}

    	public void sub(Fraction other) {
        	int lcm = getLCM(denominator, other.denominator);
        	numerator = numerator * (lcm / denominator) - other.numerator * (lcm / other.denominator);
        	denominator = lcm;
        	reduce();
    	}

    	public void mul(Fraction other) {
        	numerator *= other.numerator;
        	denominator *= other.denominator;
        	reduce();
    	}

    	public void div(Fraction other) {
        	if (other.numerator == 0) {
            	throw new IllegalArgumentException("Cannot divide by zero");
        	}
        	numerator *= other.denominator;
        	denominator *= other.numerator;
        	reduce();
    	}

    	public void reduce() {
        	int gcd = getGCD(numerator, denominator);
        	numerator /= gcd;
        	denominator /= gcd;
        	if (denominator < 0) {
            	numerator = -numerator;
            	denominator = -denominator;
        	}
    	}

    	public String toString() {
        	if (denominator == 1) {
            	return Integer.toString(numerator);
        	} else {
            	return numerator + "/" + denominator;
        	}
    	}
    	
    	private int getGCD(int a, int b) {
     		return b == 0 ? a : getGCD(b, a % b);
    	}

    	private int getLCM(int a, int b) {
        	return a * b / getGCD(a, b);
    	}
}