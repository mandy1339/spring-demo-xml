package pack1;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {}
	
	// constructor used for "constructor injection"
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		return "baseballCoach fortune: " + fortuneService.getFortune();
	}
	
		
}
