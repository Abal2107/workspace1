package EventHandler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile2.xml");
		
		CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cep.publish();
		cep.publish();

	}

}
