package test.java;

public class Constant1 {
	public static final int NUMBER_OF_MONTHS = 12;
	public static final double PI = (double)22/7;
	
	public static void main(String[] args) {
		System.out.println("NUMBER_OF_MONTHS: " + Constant1.NUMBER_OF_MONTHS); // we can access the constant without class name as well
		System.out.println("PI: " + Constant1.PI);
	}
}
