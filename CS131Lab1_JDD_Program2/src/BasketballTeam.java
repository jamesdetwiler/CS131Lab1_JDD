
public class BasketballTeam extends SportsTeam{

	//instance variables
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		
		super();
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
		
	}//end empty-argument constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		
		
	}//end preferred constructor

	
	public double fieldGoalPercentage() {
		
		double result = (double) fieldGoals/ (double) fieldGoalsAttempted;
		return result;
		
	}//end fieldGoalPercentage
	
	public double freeThrowPercentage() {
		
		double result = (double) freeThrows/ (double) freeThrowsAttempted;
		return result;
		
	}//end freeThrowPercentage
	
	public double[] getStats() {
		
		double[] stats = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		return stats;
		
		
	}//end getStats
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		setWins (wins);
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		setFieldGoalsAttempted (fieldGoalsAttempted);
		setFreeThrows(freeThrows);
		setFreeThrowsAttempted(freeThrowsAttempted);
		
	}//end setStats
	
	
	//getters and setters
	
	public int getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

	@Override
	public String toString() {
		return "BasketballTeam [fieldGoals=" + fieldGoals + ", fieldGoalsAttempted=" + fieldGoalsAttempted
				+ ", freeThrows=" + freeThrows + ", freeThrowsAttempted=" + freeThrowsAttempted + ", teamName="
				+ teamName + ", teamMascot=" + teamMascot + ", headCoach=" + headCoach + ", wins=" + wins + ", losses="
				+ losses + ", fieldGoalPercentage=" + fieldGoalPercentage() + ", freeThrowPercentage="
				+ freeThrowPercentage() + ", getWinPercentage=" + getWinPercentage() + "]";
	}
	

	
	//end toString
	
	
}//end class
