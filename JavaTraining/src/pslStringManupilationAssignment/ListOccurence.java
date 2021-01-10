/*3.	Write a program to find the availability of given number in the list. 
static int findPosition(int num,int[] nos)
*/

package pslStringManupilationAssignment;

import java.util.*;



public class ListOccurence {
	static List<Integer> list = new ArrayList<Integer>();
	
	static void findPosition(int num)
	{
		if(list.contains(num))
			System.out.println("'"+num+"' Found at index '"+list.indexOf(num)+"' in the list");
		else System.out.println(num+" not found in the list");
	}
	
	public static void main(String[] args) {
		for(int i=1;i<30;i+=3) list.add(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find in string");
		int n=sc.nextInt();
		findPosition(n);
		
		sc.close();
	}
}
