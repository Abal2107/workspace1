package jdbcframework;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertEmployee(Employee e){
		String query = "insert into Employee values("+e.getId()+",'"+e.getName()+"','"+e.getProject()+"',"+e.getSalary()+")";
		return jdbcTemplate.update(query);
	}
	public int udateEmployee(Employee e)
	{
		String query="update employee set name='"+e.getName()+"', salary="+e.getSalary()+", project='"+e.getProject()+"' where id="+e.getId()+")";
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Employee e){
		String query = "delete from Employee where id="+e.getId()+")";
		return jdbcTemplate.update(query);
	}
	
}
