/*has different dimensions, capacity, brand, power supply requirements, battery backup, etc.*/

package psl.inventory;

import java.util.Scanner;

public class HardwareProduct extends Product{
	
	Scanner sc=new Scanner(System.in);
	
	public String dimensions="Not Yet Specified";
	public String capacity="Not Yet Specified";
	public String brand="Not Yet Specified";
	public String Power="Not Yet Specified";
	public String battery="Not Yet Specified";

	@Override
	public void Insert(String id, String name,int serial, int price){
		productId=id;
		productName=name;
		serialNumber=serial;
		Price=price;
		
		System.out.println("Enter Dimensions");
		dimensions=sc.nextLine();
		System.out.println("Enter Capacity");
		capacity=sc.next();
		System.out.println("Enter Brand Name");
		brand=sc.next();
		System.out.println("Enter Power");
		Power=sc.next();
		System.out.println("Enter Battery Name");
		battery=sc.next();
		
			
	}

	@Override
	public void Show() {
		System.out.println("Product Type  : Hardware");
		System.out.println("Product Id    : "+productId);
		System.out.println("Product Name  : "+productName);
		System.out.println("Product Price : "+Price);
		System.out.println("Serial Number : "+serialNumber);
		System.out.println("Dimensions    : "+dimensions);
		System.out.println("Capacity      : "+capacity);
		System.out.println("Brand         : "+brand);
		System.out.println("Power         : "+Power);
		System.out.println("Battery       : "+battery);
		System.out.println();
		
	}
}
