package studyonline.object_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("object_setter_dependency_injection_beans.xml");
		Student student = context.getBean("student", Student.class);
		student.eat();
		student.study();
		student.playCricket();
		student.sleep();
	}
}
