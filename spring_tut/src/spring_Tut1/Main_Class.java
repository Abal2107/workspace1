package spring_Tut1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorldSpring obj = (HelloWorldSpring) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
	}

}
