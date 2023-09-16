package studyonline.springs_core;

public class Airtel implements SimCard {
	
	public Airtel() {
		System.out.println("Airtel constructor called");
	}
	@Override
	public void calling() {
		System.out.println("Calling via Airtel");
		
	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing internet via Airtel");
		
	}
}
