package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.EmployeeBean;

public class Main {
	public static void main(String[]args) {
		String fileLocaton="/in/sp/resources/applicationContext.xml";
		 ApplicationContext context =new ClassPathXmlApplicationContext(fileLocaton);
		 EmployeeBean e=(EmployeeBean) context.getBean("emp1");
	  System.out.println(e);
		 
	}

}
