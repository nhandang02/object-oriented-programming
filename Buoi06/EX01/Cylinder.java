public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		super();
		setHeight(height);
	}
	
	public Cylinder(double radius) {
		super();
		setRadius(radius);
		setHeight(height);
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		setHeight(height);
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI * this.radius * this.radius * this.height;
	}
	
	public String toString() {
		return "Cylinder{" + this.color + "/" + this.radius + "/" + this.height + "/" +  this.getVolume() + "}" ;
	}
}