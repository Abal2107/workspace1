package package2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_att1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		GS_att1 obj = (GS_att1) context.getBean("Student1");
		System.out.println(obj.getName());
		System.out.println(obj.getKlass());
		System.out.println(obj.getSubject());
		
		
		GS_att1 obj1 = (GS_att1) context.getBean("Student2");
		System.out.println(obj1.getName());
		System.out.println(obj1.getKlass());
		System.out.println(obj1.getSubject());
		

	}

}
