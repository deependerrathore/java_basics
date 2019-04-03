package test.java;

/**
 * Program to use final variable to Create constant
 * @author deepak
 *
 */
public class FinalVar {
	//final static double PI = (double)22/7;
	final static double PI = 3.14159;
	public static void main(String[] args) {
		double r = 10.0,a;
		a = PI * r * r;
		System.out.println("Area of the circle: " + a);
	}
}
