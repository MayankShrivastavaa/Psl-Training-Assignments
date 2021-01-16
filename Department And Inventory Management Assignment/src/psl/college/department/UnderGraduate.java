package psl.college.department;

public class UnderGraduate extends Student{
	@Override
	public void name(String name) {
		System.out.print(name);
	}
	
	public void type(){
		System.out.println(" is an Undergraduate student\n");
	}
}
