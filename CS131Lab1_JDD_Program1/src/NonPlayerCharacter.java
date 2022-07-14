import java.security.SecureRandom;
import java.util.*;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	//instance variables
	private boolean active;
	private String intelligenceType;
	
	
	public NonPlayerCharacter() {
	
		super();
		this.active = false;
		this.intelligenceType = "AVERAGE";
		
	}	//end empty-argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
	
		super();
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
		
	}//end preferred constructor
	
	//getters and setters
	
	public boolean isActive() {
		return active;
	}//end isActive
	
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType
	
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligenceType
	
	public String reportStructure() {
		
			StringBuilder sb = new StringBuilder(super.reportStructure());
			sb.append("Active: "+isActive()+"\n");
			sb.append("Intelligence: "+getIntelligenceType()+"\n");
			sb.append("==================================\n");
			
			return sb.toString();
			
	}//end reportStructure method
	
	public String introduce() {
		
		return "Hello, my name is "+getUniqueID(); 
		
	}//end introduce method
	
	public String exclaim() {
		
		String [] array = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random r = new Random();
		int a = r.nextInt(5);
				
		return array[a];
		
	}//end exclaim method
	
	
	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", uniqueID="
				+ uniqueID + ", personality=" + personality + "]";
	}//end toString
	
}//end class

