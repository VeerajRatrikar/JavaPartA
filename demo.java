package veeraj;

class sample{
	int a=10;
	int b=20;
	
	void display() {
		System.out.println("value of a and b : "+a+" "+b);
	}
	void add() {
		System.out.println("Sum is:" +(a+b));
	}
}
public class demo {

	public static void main(String[] args) {
		sample a =new sample();
		a.display();
		a.add();
	}

}
