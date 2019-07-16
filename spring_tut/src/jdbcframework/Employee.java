package jdbcframework;

public class Employee {
	
	int id, salary;
	String name, project;
	
	public Employee(int id, String name,String project, int salary){
		this.id = id;
		this.name =name;
		this.project = project;
		this.salary=salary;
		
	}
	
	
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getProject() {
		return project;
	}
	

}
