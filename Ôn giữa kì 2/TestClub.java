public class TestClub {
	public static void main(String[] args) {
		Club clb1 = new Club("Manchester United", 8, 1, 1);
		Club clb2 = new Club();
		Club clb3 = new Club(clb1);
		
		System.out.println(clb1);
		System.out.println(clb2);
		System.out.println(clb3);
		
		System.out.println(clb3.isFinish());
		System.out.println(clb3.numMatchesPlayed());
		System.out.println(clb3.getPoint());
		
		clb3.setName("Nhan dep trai");
		clb3.setWins(1);
		clb3.setDraws(5);
		clb3.setLosses(2);
		
		System.out.println(clb3);	
		System.out.println(clb3.isFinish());
		System.out.println(clb3.numMatchesPlayed());
		System.out.println(clb3.getPoint());
	}
}