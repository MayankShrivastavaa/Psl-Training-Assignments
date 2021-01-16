package psl.college.department;

public class Graduate extends Student{

	@Override
	public void name(String name) {
		System.out.print(name);
	}
	public void type(){
		System.out.println(" is a graduate student\n");
	}
	
}
