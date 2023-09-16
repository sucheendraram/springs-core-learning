package studyonline.springs_core;

public class Vodafone implements SimCard {
	
	public Vodafone() {
		System.out.println("Vodafone constructor called");
	}
	@Override
	public void calling() {
		System.out.println("Calling via Vodafone");
		
	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing internet via Vodafone");
		
	}

}
