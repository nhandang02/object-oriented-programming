public class TestRegularPolygon {
	public static void main (String[] args) {
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon("Nhancc", 3, 2);
		RegularPolygon rp3 = new RegularPolygon("q1", 7, 7);
		RegularPolygon rp4 = new RegularPolygon(rp2);
		
		
		System.out.println(rp4);	
	}
}