package companyA;

public class Test {
	static void printForm(PrintFormat p) {
		System.out.println(p.getPrintFormat());
	}
	
	public static void main(String[] args) {
		
		HourlyEmployee he = new HourlyEmployee("John", "Doe", 1234 , 2019 , 15.00, 40);
		System.out.println(he);
		
		SalariedEmployee se = new SalariedEmployee("James", "Moline", 5678 , 2010 , 40000.00, 8000.00);
		System.out.println(se);
		
		Customer c = new Customer("Jane", "Smith", "JSmith", "Password");
		System.out.println(c);
		
		System.out.println("");
		printForm (he);
		printForm (se);
		printForm (c);
		System.out.println("----------------- getPrintFormat SysOut Print Below --------------------\n");
		System.out.println(he.getPrintFormat());
		System.out.println(se.getPrintFormat());
		System.out.println(c.getPrintFormat());
		
	}
}
