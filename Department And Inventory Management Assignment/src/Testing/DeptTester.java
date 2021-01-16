package Testing;
import psl.college.department.*;

public class DeptTester {
	public static void main(String[] args) {
	
	DeptConsole console=new DeptConsole();
	Person p1=new GradType();
	console.show(p1);
	
	Person p2=new UnderGrad();
	console.show(p2);
	
	Person p3=new Graduate();
	console.show(p3);
	
	Person p4=new UnderGraduate();
	console.show(p4);
	
	Person p5=new Temporary();
	console.show(p5);
	}
}
