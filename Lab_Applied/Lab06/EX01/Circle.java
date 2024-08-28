public class Circle {
	protected double radius = 1.0;
	protected String color = "red";
	
	public Circle() {
		setRadius(radius);
		setColor(color);
	}
	
	public Circle(double radius) {
		setRadius(radius);
		setColor(color);
	}
	
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return (this.radius * this.radius) * Math.PI;
	}
	
	public String toString() {
		return "Circle{" + this.color + "/" + this.radius + "/" + this.getArea() + "}" ;
	}
}