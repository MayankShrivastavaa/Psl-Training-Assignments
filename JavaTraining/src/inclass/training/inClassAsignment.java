package inclass.training;

class Animals{
	private String name;
	private String color;	
	
	public Animals(){
		System.out.println("Superclass Animal Default Constructor Invoked");
		this.name="lion";
		this.color="orange";
	}
	//paramaterized constructor
	public Animals(String nm){
		this.name=nm;
		this.color="Not Specified";
		System.out.println("Superclass Animal Parameterized Constructor Invoked");
	}
	
	public void setName(String nm){
		this.name=nm;
	}
	public void setColor(String nm){
		this.color=nm;
	}
	
	//accessor method
	public void details()
	{
	System.out.println("name = "+this.name);
	System.out.println("color = "+this.color);
	}
}

public class inClassAsignment {
	
	public static void main(String[] args) {
		
	}
}
