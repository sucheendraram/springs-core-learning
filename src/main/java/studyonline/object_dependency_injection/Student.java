package studyonline.object_dependency_injection;

public class Student {
	private int studentId;
	private Activities activities;
	
	
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setActivities(Activities activities) {
		this.activities = activities;
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
	
	public void sleep() {
		activities.sleep(studentId);
	}

}
