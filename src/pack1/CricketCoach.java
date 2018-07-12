package pack1;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast cricket batting for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach Fortune: " + fortuneService.getFortune();
	}

	
	// setters used for "setter injection"
	//////////////////////////////////////
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	// init method for spring factory
	//////////////////////////////////////
	public void startThingsUpBoy() {
		System.out.println("Starting up with init() BOY");
	}
	
	// destroy method for spring factory
	//////////////////////////////////////
	public void cleanUpToDestroyBoy() {
		this.emailAddress = null;
		System.out.println("EXPLODE");
	}
	
	
	
	
	// getters
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
		
	
	
}
