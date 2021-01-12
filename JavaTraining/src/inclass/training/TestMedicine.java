/*Create a class Medicine to represent a drug manufactured by a pharmaceutical company. 
 * Provide a function displayLabel() in this class to print Name and address of the company.*/

package inclass.training;
import java.util.Random;

class Medicine {	
	public void displayLabel(){
		System.out.println("Persistent Hospital Nagpur");
	}
}
/*
Derive Tablet, Syrup and Ointment classes from the Medicine class. 
Override the displayLabel() function in each of these classes to print 
additional information suitable to the type of medicine. */

//in case of tablets, it could be “store in a cool dry place”
class Tablet extends Medicine{
	public void displayLabel(){
		System.out.println("store in a cool dry place");
	}
}
//in case of Syrup it could be “Keep away from the reach of children” etc.
class Syrup extends Medicine{
	public void displayLabel(){
		System.out.println("Keep away from the reach of children");
	}
}
//in case of ointments it could be “for external use only” etc.
class Ointment extends Medicine{
	public void displayLabel(){
		System.out.println("for external use only");
	}
}

public class TestMedicine{
	public static void main(String[] args) {
		//Declaring an array of Medicine references of size 10
		Medicine[] med=new Medicine[10];
		
		//making object of type random
		Random random=new Random();		
		for (int i = 0; i < med.length; i++) {
			//generating and storing random number in type
			int type=random.nextInt(3);
			switch(type){
			case 1:{med[i]=new Tablet();
				break;
				}
			case 2:{med[i]=new Syrup();
				break;
				}
			default:{med[i]=new Ointment();
				break;
				}
			}
			med[9]=new Medicine();//to show last obj as Medicine class
			//Check the polymorphic behavior of the displayLabel() method.
			med[i].displayLabel();
		}
	}
}
/* 
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3.
Refer Java API Documentation to find out random generation feature.
Check the polymorphic behavior of the displayLabel() method.

*/