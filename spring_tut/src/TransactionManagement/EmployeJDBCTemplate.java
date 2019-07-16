package TransactionManagement;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class EmployeJDBCTemplate {

	public DataSource dataSource;
	public JdbcTemplate jdbcTemplate;
	public PlatformTransactionManager transactionManager;
	
	public void setDataSource(DataSource ds)
	{
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
	      this.transactionManager = transactionManager;
	   }
	
	public void insert(Integer id, String name,String project,Integer salary)
	{
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
		try{
			String insertQueryEmp = "insert into Employee values(?,?,?,?)";
			jdbcTemplate.update(insertQueryEmp,id,name,project,salary);
			
			
			String maxQuery = "select max(salary) from employee";
			int maxSalary = jdbcTemplate.queryForObject(maxQuery,Integer.class);
			
			
			String insertQuerySal = "insert into m_salary(id,name,salary) SELECT id,name,salary FROM Employee WHERE salary = ?";
			jdbcTemplate.update(insertQuerySal,maxSalary);
			
			
			transactionManager.commit(status);
		}catch (DataAccessException e) {
	         System.out.println("Error in creating record, rolling back");
	         transactionManager.rollback(status);
	         throw e;}
	}
		
		public List<Employee> listEmployees()
		{
			String get_max_query = "select * from Employee,m_salary where Employee.id = m_salary.id";
			List<Employee> emp = jdbcTemplate.query(get_max_query, new EmployeeMapper());
			return emp;
		}
		
	}
	
	
