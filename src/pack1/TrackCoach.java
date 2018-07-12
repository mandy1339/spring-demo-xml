package pack1;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 10 miles";
	}

	@Override
	public String getDailyFortune() {
		return "track coach fortune: " + fortuneService.getFortune();
	}

}
