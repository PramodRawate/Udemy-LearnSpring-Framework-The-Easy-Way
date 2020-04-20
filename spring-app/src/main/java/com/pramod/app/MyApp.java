package com.pramod.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		ManageAppData appData = (ManageAppData) context.getBean("manageAppData");
		appData.accessData();
		appData.storeData();
		appData.disconnect();
		
		System.out.println("Done");
	}
}
