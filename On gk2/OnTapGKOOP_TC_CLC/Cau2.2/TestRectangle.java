public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rc2 = new Rectangle("Ruby", "Red", 3, 4);
		/*rc2.setName("Nhan dep trai");
		rc2.setColor("Blue");
		rc2.setLength(0);
		rc2.setWidth(0);
		System.out.println(rc2);*/
		Rectangle rc3 = rc2.resize(3);
		System.out.println(rc3);
	}
}