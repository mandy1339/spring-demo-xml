package pack2;

import pack1.FortuneService;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes;
	

	@Override
	public String getFortune() {
		int randInt = (int)(Math.random() * fortunes.length);
		return fortunes[randInt];
	}


	// setter for injection via "setter injection"
	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}

	
}
