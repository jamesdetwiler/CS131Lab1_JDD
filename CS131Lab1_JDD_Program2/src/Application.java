import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

						
				//Test BasketballTeam class
		
				BasketballTeam b1 = new BasketballTeam("Team B", "Mascot B", "Coach B");
				b1.setStats(9, 1, 30, 60, 20, 25);
				BasketballTeam c1 = new BasketballTeam("Team C", "Mascot C", "Coach C");
				c1.setStats(8, 2, 25, 60, 10, 20);
				
				System.out.println(b1.toString());
				System.out.println(c1.toString());
				System.out.println(Arrays.toString(b1.getStats()));
		
				
	}//end main

}//end class
