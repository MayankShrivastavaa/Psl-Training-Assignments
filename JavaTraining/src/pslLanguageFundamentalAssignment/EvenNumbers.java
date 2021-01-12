/*Find the total of even numbers present in an array*/

package pslLanguageFundamentalAssignment;

public class EvenNumbers {
	public static boolean isEven(int j)
	{
		if(j%2==0)
		return true;
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr=new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+7;
		}
		for (int i : arr) {
			if(isEven(i))
			System.out.println(i);
		}
		
	}

}
