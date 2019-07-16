package TransactionManagement;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("DAO3.xml");
		
		
		EmployeJDBCTemplate  empTemplate= (EmployeJDBCTemplate) context.getBean("employeeJDBCTemplate");
		
		empTemplate.insert(5, "user5", "us", 1200);
		empTemplate.insert(6, "user6", "us", 3400);
		
		List<Employee> emp = empTemplate.listEmployees();
		
		for(Employee rec: emp )
		{
			System.out.println("ID"+rec.getId());
			System.out.println("Name"+rec.getName());
			System.out.println("Project"+rec.getProject());
			System.out.println("Salary"+rec.getSalary());
			
		}
	}

}
