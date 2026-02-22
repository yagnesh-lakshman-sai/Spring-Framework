package in.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.com.AppConfig;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
