package studyonline.springs_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SimCard sim = (SimCard) context.getBean("sim");
		sim.calling();
		sim.browseInternet();
	}
}
