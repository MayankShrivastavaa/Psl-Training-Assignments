package Testing;
import java.util.Scanner;

import psl.inventory.*;

public class InventoryConsole {
	Scanner sc=new Scanner(System.in);
	
	
	public void insert(Product p){
		System.out.println("Enter Product Id");
		String id=sc.next();
		System.out.println("Enter Product Name");
		String name=sc.next();
		System.out.println("Enter Serial Number");
		int serial=sc.nextInt();
		System.out.println("Enter Price of Product");
		int price=sc.nextInt();
		p.Insert(id, name, serial, price);
	}
	
	public void show(Product p){
		if(p instanceof SoftwareProduct)
			((SoftwareProduct)p).Show();
		if(p instanceof HardwareProduct)
			((HardwareProduct)p).Show();
	}
	
}
