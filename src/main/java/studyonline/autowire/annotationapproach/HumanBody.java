package studyonline.autowire.annotationapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanBody {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("automatic_autowiring_beans.xml");
		Human human = context.getBean("human", Human.class);
		human.pumpBlood();
	}
}
