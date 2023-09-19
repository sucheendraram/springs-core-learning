package studyonline.autowiring.xmlapproach;

public class Human {
	private Heart heart;

	public Human(Heart heart) {
		System.out.println("Constructor called!");
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("Setter method called");
		this.heart = heart;
	}

	public void pumpBlood() {
		if (heart != null) {
			heart.pumpingBlood();
		} else {
			System.out.println("Heart stopped. Human is dead!");
		}
	}
}
