/*The Customer class has the attributes - 
 id, name, homePhone, cellPhone, workPhone, street, city, state, zip. */

package main;

public class Customer {
	private int id;
	private String name;
	private int homePhone;
	private int cellPhone;
	private int workPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	//Create a constructor to create Customer class and it will get the parameters id and name. 
	public Customer(int Id, String Name){
		this.id=Id;
		this.name=Name;
	}
	
	// methods to print Phone Numbers
	public void printPhoneNumbers(){
		System.out.println("Home Phone : "+homePhone+"\nCell Phone : "+cellPhone+"\nWork Phone : "+workPhone);
	}
	
	// methods to print Shipping Address
	public void printShippingAddress(){
		System.out.println("Shipping Address : "+street+", "+city+", "+state+" "+zip);
	}
	
	// method to change the address
	public void setPrintingAddress (String Street, String City, String State, int Zip){
		this.street=Street;
		this.city=City;
		this.state=State;
		this.zip=Zip;
	}
	
	//  method to change the numbers
	public void setPhoneNumbers (int homephone, int cellphone, int workphone){
		this.homePhone=homephone;
		this.cellPhone=cellphone;
		this.workPhone=workphone;
	}
	
	public void getDetails(){
		System.out.println("Customer Id : "+id);
		System.out.println("Customer Name : "+name);
		printPhoneNumbers();
		printShippingAddress();
		System.out.println();
	}
	
}
