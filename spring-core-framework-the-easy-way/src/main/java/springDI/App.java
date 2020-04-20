package springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.JavaConfig;

public class App {

	public static void main(String[] args) {
		
		/* Application context parses the xml file, identifies the classes/components/beans.
		 * When program is executed it create all the instantiates of the classes.
		 * it also identifies the dependencies required by the classes and injects the dependencies.
		 */
		try {
			//Bean using xml Config
			//ApplicationContext context = new ClassPathXmlApplicationContext("Config2.xml");
			//AnimalBean bean = (AnimalBean) context.getBean("animalBean");
			
			//Bean using Java COnfig
			ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
			AnimalBean bean = (AnimalBean) context.getBean("animalBean");
			
			bean.shout();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
