
public class Employee {
	private String name;
	private int empID;
	
	
	public Employee(String name, int empID) {
		super();
		this.name = name;
		this.empID = empID;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	
}
