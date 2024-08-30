package veeraj;

class Box{
	double width,height,depth;
	Box(){
		width=1.0;
		height=2.0;
		depth=3.0;
	}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	Box(double width){
		this.width=width;
		height=depth=width;
	}
   double volume(){
	   return width*height*depth;
   }
}
public class pgm2 {

	public static void main(String[] args) {
		Box box1 = new Box();
		System.out.println("Box1:Default Constructor");
		System.out.println("width:" +box1.width);
		System.out.println("height:" +box1.height);
		System.out.println("depth:" +box1.depth);
		System.out.println("Volume of box 1:"+box1.volume());
		System.out.println();
		
		Box box2 = new Box(2,3,4);

		System.out.println("Box2:Parameterised Constructor");
		System.out.println("width:" +box2.width);
		System.out.println("height:" +box2.height);
		System.out.println("depth:" +box2.depth);
		System.out.println("Volume of box 2:"+box2.volume());
		
		Box box3 = new Box(2.5);
		System.out.println("Volume of box 3:"+box3.volume());
		
	}

}
