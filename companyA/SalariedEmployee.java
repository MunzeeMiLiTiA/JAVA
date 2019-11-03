package companyA;

public class SalariedEmployee extends Employee implements PrintFormat {

	//Declaring instance fields

	private double salary;
	private double bonus;

	//Parameterized constructor

	public SalariedEmployee(String firstName, String lastName, int employeeID , int hireYear, double salary, double bonus) {
		super(firstName, lastName, employeeID, hireYear);
		this.salary = salary;
		this.bonus = bonus;
	}

	//getters and setters

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
	this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
	this.bonus = bonus;
	}
	
	//toString method is used to display the contents of an object inside it

	@Override

	public String toString() {
		return super.toString()+" - Salaried - [salary=" + salary + ", bonus=" + bonus + "]";
	}

	@Override
	public String getPrintFormat() {
		String result = "";
		result += "-----Salaried Employee-----\n";
		result += "| " + firstName + " | " + lastName + " |\n";
		result += "***********\n";
		result += "| " + employeeID + " | " + hireYear + " |\n";
		result += "***********\n";
		result += "| " + salary + " | " + bonus + " |\n";
		
		return result;
	}
}