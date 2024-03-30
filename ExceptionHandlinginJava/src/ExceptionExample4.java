
public class ExceptionExample4 {

	public static void main(String[] args) {
		// Number format exception
		String age = "Twenty";
		try {
			int newage = Integer.parseInt(age);
			if (newage >= 18) {
				System.out.println("Yes you can vote");
			}
			else {
				System.out.println("No you can not vote");
			}
		}catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}catch(NullPointerException e) {
			System.out.println("Exception : "+e);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		System.out.println("The End...");
	}

}
