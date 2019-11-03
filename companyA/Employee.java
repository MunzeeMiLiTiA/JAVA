
package companyA;

public abstract class Employee extends Person {

	//Declaring instance variables

	public int employeeID;
	public int hireYear;

	//Parameterized constructor

	public Employee(int employeeID, int hireYear) 
	{
	this.employeeID = employeeID;
	this.hireYear = hireYear;
	}

	protected Employee(String firstName, String lastName, int employeeID, int hireYear) {
		super(firstName, lastName);
		this.employeeID = employeeID;
		this.hireYear = hireYear;
	}

	// getters and setters
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int EmployeeID) {
		this.employeeID = EmployeeID;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int HireYear) {
		this.hireYear = HireYear;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeID=" + employeeID + ", hireYear=" + hireYear + "]";
	}	
}
