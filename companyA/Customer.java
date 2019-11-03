package companyA;

public class Customer extends Person implements PrintFormat {

	//Declaring instance variables
	//Declaring instance variables

		private String userName;
		private String password;

		//Parameterized constructor

		public Customer(String userName , String password) 
		{
		this.userName = userName;
		this.password = password;
		}

		protected Customer(String firstName, String lastName, String userName, String password) {
			super(firstName, lastName);
			this.userName = userName;
			this.password = password;
		}

		// getters and setters
		
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getpassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" + password + "]";
		}

		@Override
		public String getPrintFormat() {
			String result = "";
			result += "-----Customer-----\n";
			result += "| " + firstName + " | " + lastName + " |\n";
			result += "***********\n";
			result += "| " + userName + " | " + password + " |\n";
			
			return result;
		}	
	}
