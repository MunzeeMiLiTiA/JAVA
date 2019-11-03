package companyA;

public class HourlyEmployee extends Employee implements PrintFormat {

	//Declaring instance fields

	private double payrate;
	private int workedHours;

	//Parameterized constructor

	public HourlyEmployee(String firstName, String lastName, int employeeID , int hireYear, double payrate, int workedhours) {

	super(firstName, lastName, employeeID, hireYear);

	this.payrate = payrate;
	this.workedHours = workedhours;
	}
	
	// getters and setters

	public double getPayRate() {
		return payrate;
	}

	public void setPayRate(double PayRate) {
		this.payrate = PayRate;
	}

	public int getHireYear() {
		return workedHours;
	}

	public void setHireYear(int WorkedHours) {
		this.workedHours = WorkedHours;
	}

	//toString method is used to display the contents of an object inside it

	@Override

	public String toString() {
		return super.toString() + " - Hourly - [payrate=" + payrate + ", workedHours=" + workedHours + "]";
	}

	@Override
	public String getPrintFormat() {
		String result = "";
		result += "-----Hourly Employee-----\n";
		result += "| " + firstName + " | " + lastName + " |\n";
		result += "***********\n";
		result += "| " + employeeID + " | " + hireYear + " |\n";
		result += "***********\n";
		result += "| " + payrate + " | " + workedHours + " |\n";
		
		return result;
	}
}