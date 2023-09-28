public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon rg1 = new RegularPolygon();
		RegularPolygon rg2 = new RegularPolygon("q1", 4);
		RegularPolygon rg3 = new RegularPolygon("q2", 4, 5);
		RegularPolygon rg4 = new RegularPolygon(rg3);
		
		/*System.out.println(rg1);
		System.out.println(rg2);*/
		
		System.out.println(rg4);
	}	
}