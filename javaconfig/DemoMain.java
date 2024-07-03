package com.springcore.javaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student=context.getBean("firststudent",Student.class);
		
		System.out.println(student);
		student.study();
		
		Samosa samosa=context.getBean("samosa",Samosa.class);
		samosa.display();
		
	}
}
