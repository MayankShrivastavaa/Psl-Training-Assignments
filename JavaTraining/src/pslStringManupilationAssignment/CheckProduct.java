/*Ezee Shop has an online portal where customers can check about different products. 
  Customers can search for products by giving a key word.
  Write a program that accepts a product name and a key word, 
  and checks if the key word is present in the given product name.
 
static String[] initProductNames()
static boolean isPresent(String[] productNames, String keyword)
*/

package pslStringManupilationAssignment;

import java.util.*;

public class CheckProduct {
	static Map<String, String> map =  new HashMap<String, String>();
	static void insert()
	{
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter Product Name");
		String p = scin.nextLine();
		System.out.println("Enter key for Product");
		String k = scin.next();
		map.put(k,p);
		scin.close();
	}
	
	static void find()
	{
		 Scanner scin = new Scanner(System.in);
		System.out.println("Enter Key to find Product");
		String f= scin.next();
		if(map.containsKey(f))
		{
			String l = map.get(f);
			System.out.println("Product with key "+f+" Found : "+l);
		}
		else System.out.println("No product With key "+f+" found");
		scin.close();
	}
	
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 boolean t = true;
		 while(t){
			 System.out.println("1.Insert Product and Key\n2.Check For product\n3.Exit");
			 int c = sc.nextInt();
			 switch(c) {
			case 1:
				insert();
				break;
			case 2:
				find();
				break;
			case 3: 
				t=false; 
				break;
			default:System.out.println("Wrong Choice");
				break;		
		 }
		 }
		 System.out.println("Program Ended");
		 sc.close();
		 
	}
}
