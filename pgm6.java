package veeraj;
//Java program to find the sum of elements of an array using for each loop
public class pgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};int sum=0;
		for(int num:a) {
			sum = sum+num;
		}
	System.out.println("Sum of the elements in the array is: " +sum);
	}

}
