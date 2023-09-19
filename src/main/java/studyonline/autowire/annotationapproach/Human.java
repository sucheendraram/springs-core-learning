package studyonline.autowire.annotationapproach;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;

	public Human() {
		System.out.println("Default constructor");
	}

	public Human(Heart heart) {
		System.out.println("Constructor called!");
		this.heart = heart;
	}

	@Autowired
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
