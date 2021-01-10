/*Develop a program, that accepts a deposit amount and calculates amount of interest 
 * the deposit amount earns in a year. The bank pays a flat 4% interest for deposits
 *  of up to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, 
 *  and a flat 5% for deposits of more than Rs.5000.
static double calInterest(int amt) */
package pslLanguageFundamentalAssignment;

import java.util.Scanner;

public class Interest {
	static double calInterest(int amt, float r)
	{
		double intr=(amt*r)/100;
		return intr;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		if(amount<=1000)
		System.out.println(calInterest(amount, 4f));
		else if(amount>5000)
		System.out.println(calInterest(amount, 5f));
		else System.out.println(calInterest(amount, 4.5f));
		
		sc.close();
	}
}


