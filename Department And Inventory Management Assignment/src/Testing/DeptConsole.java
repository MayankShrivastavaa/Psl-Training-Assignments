package Testing;
import java.util.Scanner;

import psl.college.department.*;

public class DeptConsole {
	Scanner sc=new Scanner(System.in);
	public void show(Person p){
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		
		p.name(name);
		
		if(p instanceof Graduate)
			((Graduate)p).type();
		
		if(p instanceof UnderGraduate)
			((UnderGraduate)p).type();
		
		if(p instanceof GradType){
			((GradType)p).type();
			((GradType)p).salary();
		}
		
		if(p instanceof UnderGrad){
			((UnderGrad)p).type();
			((UnderGrad)p).salary();
		}
		
		if(p instanceof Temporary){
			((Temporary)p).type();
			((Temporary)p).salary();
		}
	}
}
