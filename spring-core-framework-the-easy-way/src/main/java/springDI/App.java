package springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		/* Application context parses the sml file, identifies the classes/components/beans.
		 * When program is executed it create all the instantiates of the classes.
		 * it also identifies the dependencies required by the classes and injects the dependencies.
		 */
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
			
			Bean bean = (Bean) context.getBean("bean");
			bean.shout();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
