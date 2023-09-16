package studyonline.springs_core;

public class Jio implements SimCard {
	
	public Jio() {
		System.out.println("Jio constructor called");
	};
	@Override
	public void calling() {
		System.out.println("Calling via Jio");
	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing internet via Jio");
	}
}
