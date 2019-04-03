package test.java;

/**
 * Program to use final variable within method to create local constant
 * @author deepak
 *
 */
public class FinalVar1 {
	public static void main(String[] args) {
		double r = 10.0,a;
		final double PI = 3.14159;
		a = PI * r * r;
		System.out.println("Area of Circle: " + a);
	}
}
