package jdbcframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("DAO.xml");
		
		EmployeeDAO ed =(EmployeeDAO) context.getBean("edao");
		int status = ed.insertEmployee(new Employee(23,"user2","us",4300));
		if(status == 1)
		System.out.println("Data inserted");
		else
			System.out.println("Problem in data insertion");
		
	}

}
