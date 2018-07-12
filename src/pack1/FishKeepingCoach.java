package pack1;

public class FishKeepingCoach implements Coach {
	
	private FortuneService fortuneService;

	public FishKeepingCoach() {}
	public FishKeepingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "feed little fish food today";
	}
	
	@Override
	public String getDailyFortune() {
		return "fishKeepingCoach fortune: " + fortuneService.getFortune();
	}

}
