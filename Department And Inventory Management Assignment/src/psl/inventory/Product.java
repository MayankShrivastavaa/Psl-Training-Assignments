/*hardware has different dimensions, capacity, brand, power supply requirements, battery backup, etc.*/
/*software has different system requirements like OS, Memory and also needs license key*/

package psl.inventory;

public abstract class Product implements IProduct{
	public String productId="Not Yet Specified";;
	public String productName="Not Yet Specified";;
	public int serialNumber=0;
	public int Price=0;
}
