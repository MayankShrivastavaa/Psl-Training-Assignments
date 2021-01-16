/*Every product has product id, product name and serial number.*/

package psl.inventory;

public interface IProduct {
	public void Insert(String id, String name, int serial, int price);
	public void Show();

}
