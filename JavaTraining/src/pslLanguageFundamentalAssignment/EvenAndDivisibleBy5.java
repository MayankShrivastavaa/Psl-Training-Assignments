/*Print all even and multiple of 5 numbers from an array
if(no%2==0 && no%5==0)*/

package pslLanguageFundamentalAssignment;
public class EvenAndDivisibleBy5 {
public static void main(String[] args) {
int[] arr=new int[100];
for (int i = 0; i < arr.length; i++) {
	arr[i]=i+7;
}
for(int no: arr){
	if(no%2==0 && no%5==0) System.out.println(no);
}
}
}
