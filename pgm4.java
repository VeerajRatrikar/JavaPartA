package veeraj;

public class pgm4 {

	public static void main(String[] args) {
		int intValue=257;
		byte narrowedByte=(byte)intValue;
	//	byte b =a;
		double widenedByteValue = intValue;
		
		System.out.println("Original Int Value: "+intValue);
		System.out.println("narrowed Byte Value(Explicit Casting):"+narrowedByte);
		System.out.println("Widened Byte Value(Implicit Casting ):"+widenedByteValue);
	}

}
