package studyonline.object_dependency_injection;

public class Student {
	private int studentId;
	private Activities activities;
	private Friends friends;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setActivities(Activities activities) {
		this.activities = activities;
	}
	
	

	public void setFriends(Friends friends) {
		this.friends = friends;
	}

	public void eat() {
		activities.eat(studentId);
	}

	public void study() {
		activities.study(studentId);
	}

	public void playCricket() {
		activities.playCricket(studentId);
	}

	public void goToClass() {
		friends.goToClass();
	}

	public void goToCanteen() {
		friends.goToCanteen();
	}

	public void doGroupStudy() {
		friends.doGroupStudy();
	}

	public void sleep() {
		activities.sleep(studentId);
	}

}
