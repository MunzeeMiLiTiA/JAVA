package companyA;

public abstract class Person {
	protected String firstName;
	protected String lastName; 
	
	protected Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	protected Person() {
		this.firstName = null;
		this.lastName = null;
	}
	
	// getters and setters

	public String FirstName() {
		return firstName;
	}

	public void setEmployeeID(String FirstName) {
		this.firstName = FirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setHireYear(String LastName) {
		this.lastName = LastName;
	}
		
	//toString method is used to display the contents of an object inside it

	@Override

	public String toString() {
		return "First Name=" + firstName + ", Last Name=" + lastName + "]";
	}
	
}