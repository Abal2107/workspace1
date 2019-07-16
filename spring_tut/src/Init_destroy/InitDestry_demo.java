package Init_destroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestry_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("NewFile1.xml");
		
		AutoEngine autoeng = (AutoEngine) context.getBean("engine");
		context.close();
		
	}

}
