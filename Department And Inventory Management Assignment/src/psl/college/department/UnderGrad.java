package psl.college.department;

public class UnderGrad extends Faculty implements Salaried{
	
	public void type(){
		System.out.print(" is an UnderGraduate level facuty");
	}

	@Override
	public void salary() {
		System.out.println(" and gets Paid every month\n");
		
	}

	@Override
	public void name(String name) {
		System.out.print(name);
		
	}

}
