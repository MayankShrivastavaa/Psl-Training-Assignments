/*
 * 1.Find the total characters present in a String
 * 2.Find the total vowels present in a String
 * 3.Find the total spaces present in a String
 * */

package pslStringManupilationAssignment;
import java.util.Scanner;

public class TotalInString {
	
	static int characters(String str){
		return str.length();
	}
	static int vowels(String str){
		char[] c=str.toCharArray();
		int count=0;
		for (int i = 0; i < c.length; i++) {
			switch(c[i]){
			case 'a': case 'e': case 'i': case 'o':case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
			count++;
			default: ;
			}
		}
		return count;
	}
	static int spaces(String str){
		String[] s=str.split(" ");
		return s.length-1;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Total Characters = "+characters(s));
		System.out.println("Total Vowels = "+vowels(s));
		System.out.println("Total Spaces = "+spaces(s));
		sc.close();
	}

}
