package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("TEbean.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.checkSpell();
	}

}
