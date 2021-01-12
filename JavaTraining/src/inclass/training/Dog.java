package inclass.training;

public class Dog extends Animals{
	public Dog(){
		super("Dog");
		System.out.println("Subclass Dog Default Constructor Invoked");
	}
	void setname(String cl){
		super.setName(cl);
		System.out.println("Subclass Dog Parameterized Constructor Invoked");
	}
	void setcolor(String cl){
		super.setColor(cl);
	}
	void show(){
		super.details();
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.show();
	}
}

