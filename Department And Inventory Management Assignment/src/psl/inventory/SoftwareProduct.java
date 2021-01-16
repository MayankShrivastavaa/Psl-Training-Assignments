/*has different system requirements like OS, Memory and also needs license key*/

package psl.inventory;

import java.util.Scanner;

public class SoftwareProduct extends Product{
	
	Scanner sc=new Scanner(System.in);
	
	public String os="Not Yet Specified";
	public String memory="Not Yet Specified";;
	public String licenseKey="Not Yet Specified";;

	@Override
	public void Insert(String id, String name, int serial, int price) {
		productId=id;
		productName=name;
		serialNumber=serial;
		Price=price;
		
		System.out.println("Enter all Supporting OS()seperated by comma(,)");
		os=sc.nextLine();
		System.out.println("Enter minimum Memory requirement in GB");
		memory=sc.next();
		System.out.println("Enter License Key");
		licenseKey=sc.next();
		
	}

	@Override
	public void Show() {
		System.out.println("Product Type     : Software");
		System.out.println("Product Id       : "+productId);
		System.out.println("Product Name     : "+productName);
		System.out.println("Serial Number    : "+serialNumber);
		System.out.println("Product Price    : "+Price);
		System.out.println("Operating System : "+os);
		System.out.println("memory           : "+memory);
		System.out.println("License Key      : "+licenseKey);
		System.out.println();
	}
	
	
	
	
}
