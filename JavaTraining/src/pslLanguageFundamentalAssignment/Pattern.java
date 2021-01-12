//Print the following patterns
/**/
package pslLanguageFundamentalAssignment;

import java.util.Scanner;

public class Pattern {
	static void numPattern(int num){
	  /*1
		1 2
		1 2 3
		1 2 3 4
		1 2 3
		1 2
		1*/
		int c=num;
		for (int i = 1; i < num*2; i++) {
			
			if(i<=num){
				for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
				}	}
			else{
				for(int j=1; j<c;j++)
					System.out.print(j+" ");
				c--;
			}
			System.out.println();
		}
	}
	static void wordPattern(String word){
	  /*H
		H e
		H e l
		H e l l
		H e l l o*/
		char[] c=word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for(int j=0; j <=i ;j++){
				System.out.print(c[j]+" ");
			}
		System.out.println();
		}
	}
	
	static void stringPattern(String s){
	  /*This
		is
		a
		Java
		World*/
		String[] c=s.split(" ");
		for (String string : c) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String wp=sc.nextLine();
		stringPattern(wp);
		System.out.println("Enter a number range : ");
		int n=sc.nextInt();
		numPattern(n);
		System.out.println("Enter a Word : ");
		String w=sc.next();
		wordPattern(w);
		
		sc.close();
	}
}
