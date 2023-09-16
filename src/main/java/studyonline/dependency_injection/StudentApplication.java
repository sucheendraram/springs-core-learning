package studyonline.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("literal_dependency_injection_beans.xml");
			Student s1 = context.getBean("student", Student.class);
			s1.disp();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
