package Testing;

import java.util.Random;

import psl.inventory.*;

public class InventoryTester{
	
	public static void main(String[] args) {
		
		Random rand=new Random();
		
		InventoryConsole console= new InventoryConsole();
	
		Product[] p=new Product[3];
		for (int i = 0; i < p.length; i++) {
			int c=rand.nextInt(5);
			if(c==1||c==4) {
				p[i]=new SoftwareProduct();
				System.out.println("Software Product");
			}
			else {
				p[i]=new HardwareProduct();
				System.out.println("Hardware Product");
			}
			
			console.insert(p[i]);
		}
		
		for (int i = 0; i < p.length; i++) {
			console.show(p[i]);
		}
	}
}
