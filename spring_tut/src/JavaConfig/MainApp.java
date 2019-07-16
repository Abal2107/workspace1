package JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hw = ctx.getBean(HelloWorld.class);
		hw.setMessage("Hello World!");
		System.out.println(hw.getMessage());
		
	}

}
