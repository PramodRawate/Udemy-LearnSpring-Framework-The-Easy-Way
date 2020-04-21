package com.pramod.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String args[]) {

		//XML Config
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		ManageAppData appData = (ManageAppData) context.getBean("manageAppData");		
		
		//Java Config
		//ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);		
		//ManageAppData appData = (ManageAppData) context.getBean("manageAppData");
		appData.accessData();
		appData.storeData();
		appData.disconnect();
		
		System.out.println("Done");
	}
}
