package CollectionInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Collection.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressSet();
		jc.getAddressProp();
		
		
	}

}
