package psl.college.department;

public class GradType extends Faculty{

	public void type(){
		System.out.print(" is a Graduate level facuty");
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
