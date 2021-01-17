/*Create a class named Contact with the following attributes : 
 * First name, Middle name, Last name, Date of birth, Gender, Anniversary, 
 * Address, Area, City, Pincode, State, Country, 
 * Telephone number, Mobile number, Email, Website. (Contact.java) */

package ExceptionHandlingAssignment;

import java.util.Scanner;

public class Contact {
	
	Scanner sc=new Scanner(System.in);
	
	String FirstName;
	String MiddleName;
	String LastName;
	String Dob;
	String Gender;
	String Anniversary;
	String Address;
	String Area;
	String City;
	int Pincode;
	String Email;
	String State;
	String Country;
	long TelephoneNumber;
	long MobileNumber;
	String Website;

	/* This method must generate an exception if any of the following validation rules fail: 
First name, last name, date of birth and email are compulsory. 
E-mail must be in the correct format , display correct format. 
At least one of either telephone or mobile number must be specified  
*/
	public void validate(){
		try{
			//First name, last name, date of birth and email are compulsory.
		if(FirstName==null||LastName==null||Dob==null||Email==null) 
			throw new Exception("One of the field is Empty :\n(First name / last name / dob / email )");
		if(TelephoneNumber!=0||MobileNumber!=0)
			throw new Exception("Enter Contact Number");
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		/*finally{
			System.out.println("Program Executed");
		}*/
	}
	
	public void setPersonal(String fn, String mn, String ln, String gen, String DOB, String ann){
		this.FirstName=fn;
		this.MiddleName=mn;
		this.LastName=ln;
		this.Gender=gen;
		this.Dob=DOB;
		this.Anniversary=ann;
	}
	
	public void getPersonal(){
		System.out.println("Name : "+FirstName+" "+MiddleName+" "+LastName);
		System.out.println("Gender : "+Gender+"\nDOB : "+Dob+"\nAnniversary : "+Anniversary);
	}
	
	public void setAddress(String add, String area, String city, int pin, String state, String con){
		this.Address=add;
		this.Area=area;
		this.City=city;
		this.Pincode=pin;
		this.State=state;
		this.Country=con;
	}
	
	public void setContact(long tele, long mob, String email, String web){
		this.TelephoneNumber=tele;
		this.MobileNumber=mob;
		this.Email=email;
		this.Website=web;
	}
	
}
