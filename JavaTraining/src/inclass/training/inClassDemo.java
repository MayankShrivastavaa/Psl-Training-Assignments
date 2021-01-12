package inclass.training;

class Animal{
	static String value;
	private String name;
	//private String color;
	
	static{
		System.out.println("static block invoked ");
		value="instance block static variable";
	}
	
	//instance block
	{
		value="instance block static variable";
		this.name="Lion";
		System.out.println("Instance block invoked..."+this.name);
	}
	//member functions to operate data members
	//default constructors
	public Animal(){
		super();
		System.out.println("Default constructor invoked..."+this.name);
	}
	//paramaterized constructor
	public Animal(String nm){
		this.name=nm;
		System.out.println("Parameterized constructor invoked..."+this.name);
	}
	
	//mutator method
	public void setName(String nm){
		this.name=nm;
	}
	
	//accessor method
	public String getName(){
		return this.name;
	}
	
}

public class inClassDemo {
	
	
	
	public static void main(String[] args) {
		Animal a=new Animal("Tiger");
		System.out.println("name "+a.getName());
		
		Animal b=new Animal();
		System.out.println("name "+b.getName());
	}
}
