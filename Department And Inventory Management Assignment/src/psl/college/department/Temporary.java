package psl.college.department;

public class Temporary extends Faculty implements Salaried{

	public void type(){
		System.out.print(" is a Temporary faculty");
	}

	@Override
	public void salary() {
		System.out.println(" and gets Paid every month");
		
	}

	@Override
	public void name(String name) {
		System.out.print(name);
		
	}
	
}
