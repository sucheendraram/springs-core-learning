package studyonline.setter_dependency_injection;

public class Student {
	private int studentId;
	private String studentName;
	

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void disp() {
		System.out.println("The name is "+studentName);
		System.out.println("The Id is "+studentId);
	}
}
