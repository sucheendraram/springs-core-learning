package studyonline.arraylist_dependency_injection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	private int studentId;
	private Activities activities;
	private Friends friends;
	private ArrayList allIds;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setActivities(Activities activities) {
		this.activities = activities;
	}

	public void setFriends(Friends friends) {
		this.friends = friends;
	}

	public void setAllIds(ArrayList allIds) {
		this.allIds = allIds;
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
	
	public void displayAllIds() {
		Iterator itr = allIds.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
