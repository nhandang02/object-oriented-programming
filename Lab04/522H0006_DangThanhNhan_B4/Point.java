public class Point {
	public static void main(String[] args) {
		Point p1 = new Point(); 
		Point p2 = new Point(3.5f, 4.2f);
        
        	System.out.println("x1 = " + p1.getX()); 
        	System.out.println("y1 = " + p1.getY()); 
        	        	
	     	System.out.println("x2 = " + p2.getX()); 
	     	System.out.println("y2 = " + p2.getY());		
	}
	
	private float x;
    	private float y;

	public Point() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	
	public Point(float x, float y) {
		this.x = x;
	     	this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
}