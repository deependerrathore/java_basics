package test.java;

public class CalculatePaisaInRupee {
	public static void main(String[] args) {
		double n = 56.50;
		int a = (int)n;
		double p = (n-a) * 100;
		System.out.println("Rs: " +a);
		System.out.println("Paise: " +(int)p);
				
	}

}
