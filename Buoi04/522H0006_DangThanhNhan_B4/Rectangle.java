public class Rectangle {
	public static void main(String [] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(15.2f, 20.2f);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Area1 = " + r1.getArea());
		System.out.println("Peremeter1 = " + r1.getPerimeter());
		System.out.println("Area2 = " + r2.getArea());
		System.out.println("Peremeter2 = " + r2.getPerimeter());
		
		r2.setWidth(2.15f);	
		r2.setLength(2.02f);
		System.out.println(r2);
		System.out.println("Area2 = " + r2.getArea());
		System.out.println("Peremeter2 = " + r2.getPerimeter());
	}
	
	private float width;
	private float length;
	private float area;
	private float perimeter;
	
	public Rectangle() {
		this.width = 1.0f;
		this.length = 1.0f;
	}
	
	public Rectangle(float width, float length) {
		this.width = width;
		this.length = length;	
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public float getArea() {
		return this.width * this.length;
	}
	
	public float getPerimeter() {
		return 2.0f *(this.width + this.length);
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	public String toString() {
		return "Rectangle[" + width + ", " + length + "]";
	}
}