package studyonline.constructor_dependency_injection;

public class Student {
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void disp() {
		System.out.println("The name is "+studentName);
		System.out.println("The Id is "+studentId);
	}
}
