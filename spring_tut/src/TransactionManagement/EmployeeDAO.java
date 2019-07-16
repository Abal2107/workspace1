package TransactionManagement;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {

	public void setDataSource(DataSource ds);
	
	public void create(int id,String name, String project, int salary);
	
	public List<Employee> listEmployees();
	
}
