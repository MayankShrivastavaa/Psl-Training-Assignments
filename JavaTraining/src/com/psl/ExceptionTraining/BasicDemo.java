package com.psl.ExceptionTraining;

public class BasicDemo {
	public static void main(String[] args) {
		String[] names=new String[5];
		names[0]="Ram";
		names[3]="Lakshan";
		names[1]="Sita";
		names[2]="Bharat";
		names[4]="Mayank";
		try{
		for (String name : names) {
			if(name==null)
				throw new Exception("Name not Present");
			System.out.println(name.toUpperCase());
		}
	}
		catch(NullPointerException e){
			System.out.println("Specialized Exception "+e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("Something Wrong Happened "+e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finally Block Executing");
		}
		System.out.println("Lets Continue to run application");
		
		BasicDemo demo=new BasicDemo();
		
		try{
		System.out.println(demo.isGreaterThanHundred("230"));
		System.out.println(demo.isGreaterThanHundred("98"));
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}
	
	//throw - Declaring Exceptions
	
	public int myParseInt(String str) throws Exception{
		return Integer.parseInt(str);
	}
	
	public boolean isGreaterThanHundred(String str)throws Exception{
		int no=myParseInt(str);
		if(no>100)
			return true;
		return false;
	}
}
