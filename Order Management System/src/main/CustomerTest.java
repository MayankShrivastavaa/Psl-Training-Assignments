package main;

public class CustomerTest extends Customer{
	
	public CustomerTest(int Id, String Name) {
		super(Id, Name);
	}

	public static void main(String[] args) {
		Customer c1=new CustomerTest(101, "Mayank Shrivastava");
		Customer c2=new CustomerTest(102, "Abhishek Yadav");
		Customer c3=new CustomerTest(103, "Udit Sharma");
		
		c1.setPhoneNumbers(32311515, 87491891, 32381861);
		c1.setPrintingAddress("Shri vihar coloy", "Datia", "Madhya Pradesh", 475661);
		
		c2.setPhoneNumbers(168643548, 216186184, 158313813);
		c2.setPrintingAddress("MIG 525 Dhanwantri Nagar", "Jabalpur", "Madhya Pradesh", 482003);
		
		c3.setPhoneNumbers(31152115, 22335111, 181913841);
		c3.setPrintingAddress("sirsaganj Bus stand", "Agra", "Uttar Pradesh", 491032);
		
		c1.getDetails();
		c2.getDetails();
		c3.getDetails();
		
	}

}
