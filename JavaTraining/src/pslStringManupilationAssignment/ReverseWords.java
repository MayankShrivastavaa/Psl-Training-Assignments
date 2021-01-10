/*Write a program that will reverse the sequence of letters in each word of a chosen paragraph . 
 For instance, " To be or not to be " Would become " oT eb ro ton ot eb"
static String  makeReverse(String str)
*/

package pslStringManupilationAssignment;

import java.util.Scanner;

public class ReverseWords {
	
	static String usingStringBuilder(String str)  //USING STRING BUILDER FUNCTION LOGIC
	{											  //CURRENTLY NOT IN USE IN PROGRAM
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();			//SWAP FUNCTION IN MAKEREVERSE FUNCTION TO USE THIS LOGIC
		return sb.toString();
	}
	
	static String reverse(String word)//PURE LOGIC
	{
		char[] c=new char[word.length()];
		String n=new String();
		int k=word.length();
		for (int i = 0; i < c.length; i++) {
			n+=word.charAt(--k);
		}
		return n;
	}
	
	static String  makeReverse(String str)
	{
		String[] s=str.split(" ");
		String f="";
		for (int i = 0; i < s.length; i++) 
		{
			f+=(reverse(s[i])+" ");
			//f+=(usingStringBuilder(s[i])+" ");//UNCOMMENT LINE TO USE STRINGBUILDER FUNCTION
		}
		return f;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		String sentence=sc.nextLine();
		System.out.println("Original String      :"+sentence);
		System.out.println("Reversed Word String :"+makeReverse(sentence));
		sc.close();
	}
}
