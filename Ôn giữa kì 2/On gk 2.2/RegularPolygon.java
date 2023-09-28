public class RegularPolygon {
	private String name;
	private int egdeAmount;
	private double egdeLength;
	
	public RegularPolygon() {
		this.name = "";
		this.egdeAmount = 3;
		this.egdeLength = 1;
	}
	
	public RegularPolygon(String name, 	int egdeAmount, double egdeLength) {
		this.name = name;
		this.egdeAmount = egdeAmount;
		this.egdeLength = egdeLength;
	}
	
	public RegularPolygon(String name, 	int egdeAmount) {
		this.name = name;
		this.egdeAmount = egdeAmount;
		this.egdeLength = 1;
	}
	
	public RegularPolygon(RegularPolygon polygon) {
		this.name = polygon.name;
		this.egdeAmount = polygon.egdeAmount;
		this.egdeLength = polygon.egdeLength;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEgdeAmount() {
		return this.egdeAmount;
	}
	
	public double getEgdeLength() {
		return this.egdeLength;
	}
	
	public void setName(String name) {
		this.name = name;;
	}
	
	public void setEgdeAmount(int num) {
		this.egdeAmount = num;
	}
	
	public void getEgdeLength(double length) {
		this.egdeLength = length;
	}
	
	public String getPolygon() {
		int a = this.egdeAmount;
		if(a == 3) return "Triagle";
		else if(a == 4) return "Quadrangle";
		else if(a == 5) return "Pentagon";
		else if(a == 6) return "Hexagon";
		else return "Polygons has the number of edges greater than 6";
	}
	
	public  double getPerimeter() {
		return this.egdeAmount * this.egdeLength;
	}
	
	public double getArea() {
		int b = this.egdeAmount;
		double a;
		if(b == 3) a=0.433;
		else if(b== 4) a=1;
		else if(b == 5) a=1.72;
		else if(b == 6) a=2.595;
		else a=-1;
		
		return (this.egdeLength*this.egdeLength)*a;
	}
	
	public String toString() {
		return this.name + " - " + this.getPolygon() + " - " + this.getArea();
	}
}