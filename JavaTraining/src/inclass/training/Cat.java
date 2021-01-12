package inclass.training;

public class Cat extends Animals{
	public Cat(){
		super("Cat");
	}
	public Cat(String nm){
		super(nm);
	}
	void setname(String cl){
		super.setName(cl);
	}
	void setcolor(String cl){
		super.setColor(cl);
	}
	void show(){
		super.details();
	}
	
}
