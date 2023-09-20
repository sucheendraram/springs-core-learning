package studyonline.reading_literals_using_propertiesfile.annotationsapproach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("injecting_literals_using_properties_annotations.xml");
		Student student = context.getBean("student", Student.class);
		student.display();
	}
}
