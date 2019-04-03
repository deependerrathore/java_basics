package test.java;

public class Interest {
	public static void main(String[] args) {
		double ci,p,r,n,a;
		
		p = 1000;
		r = 10;
		n = 3;
		
		a = p * Math.pow((1 + (r/100)),n);
		
		ci = a - p;
		System.out.println("Amount = " + a);
		System.out.println("Compound Interest = " + ci);
		
	}
}
