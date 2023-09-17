package studyonline.arraylist_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("arraylist_object_setter_dependency_injection_beans.xml");
		Student student = context.getBean("student", Student.class);
		
		student.eat();
		student.study();
		student.playCricket();
		student.goToClass();
		student.goToCanteen();
		student.doGroupStudy();
		student.sleep();
		student.displayAllIds();
		
		
		Student anotherStudent = context.getBean("anotherStudent", Student.class);
		anotherStudent.eat();
		anotherStudent.study();
		anotherStudent.playCricket();
		anotherStudent.goToClass();
		anotherStudent.goToCanteen();
		anotherStudent.doGroupStudy();
		anotherStudent.sleep();
		anotherStudent.displayAllIds();
	
	}
}
