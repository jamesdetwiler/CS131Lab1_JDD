/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());

		//The following added to test my methods
		//System.out.println(npc.exclaim());
		//System.out.println(npc.introduce());
		
	}//end main

}//end class