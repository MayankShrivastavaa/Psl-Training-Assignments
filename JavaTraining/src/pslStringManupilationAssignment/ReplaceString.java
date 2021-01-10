/*Write a function find and replace 
 * which will replace the given string from the source string.*/

package pslStringManupilationAssignment;

import java.util.Scanner;

public class ReplaceString {
	static String given=new String("my name is mayank mayank parth parth");
	
	static String findAndReplace(String old,String n)
	{
		String[] s=given.split(" ");
		String f=new String();
		for (int i = 0; i < s.length; i++)
		{
			if(s[i].equals(old)) s[i]=n;
			f+=(s[i]+" ");
		}
		return f;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Given String '"+given+"'");
	System.out.print("replace ");
	String old=sc.next();
	System.out.print("with ");
	String nw=sc.next();
	System.out.println("Old String : "+given);
	given=findAndReplace(old, nw);
	System.out.println("New String : "+given);
	
	sc.close();
	}	
}
