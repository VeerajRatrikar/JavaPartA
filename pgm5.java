package veeraj;
import java.util.Arrays;
import java.util.Scanner;
//Java program to sort the string elements in a 1-D array
public class pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		String a[]= {"Apple","Car","Bus","Jeep","Mango"};
		
		System.out.println("Unsorted array string:");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		
		}
		Arrays.sort(a);
		System.out.println("Stored array string:");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		
		}
	}

}
