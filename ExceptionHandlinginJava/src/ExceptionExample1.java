
public class ExceptionExample1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b ;
		System.out.println("c = "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception"+e);
		}
//		System.out.println("c = "+c);
		System.out.println("The End...");

	}

}
