package in.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.com.AppConfig;
import in.com.beans.ReportService;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
	
			ReportService service = 
					context.getBean(ReportService.class);
			
			service.generateReport();
	}
}









