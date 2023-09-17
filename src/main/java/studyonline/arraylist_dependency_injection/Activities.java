package studyonline.arraylist_dependency_injection;

public class Activities {
	
	public Activities() {
		System.out.println("Activities object created");
	}
	
	void eat(int id) {
		System.out.println(id+" -- "+"Student is eating..");
	}
	
	void sleep(int id) {
		System.out.println(id+" -- "+"Student is sleeping");
	}
	
	void playCricket(int id) {
		System.out.println(id+" -- "+"Student is playing cricket..");
	}
	
	void study(int id) {
		System.out.println(id+" -- "+"Student is studying..");
	}
}
