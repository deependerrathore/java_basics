package test.java;

/**
 * declare variable at end
 * @author deepak
 *
 */
public class DeclareAtEnd {
	public static void main(String[] args) {
		msg = "Hellow Java Developer..!";
		System.out.println("Message : " + msg);
	}
	
	 static String msg;//if we won't put static then we will get-	Cannot make a static reference to the non-static field msg

}
