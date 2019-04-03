package test.java;

public class AreaTriangle {
	public static void main(String[] args) {
		double a,b,c,area;
		a= 3;
		b= 4;
		c= 5;
		
		double perimeter = (a+b+c)/2;
		area = Math.sqrt(perimeter * (perimeter-a) * (perimeter - b) * (perimeter -c));
		System.out.println("Area of the triangle is = " + area);
	}

}
