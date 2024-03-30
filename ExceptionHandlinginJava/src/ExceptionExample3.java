
public class ExceptionExample3 {
	public static void main(String[] args) {
		String str = null;
		try {
			int len = str.length();
			System.out.println("Length : "+len);
		}catch(NullPointerException e) {
			System.out.println("Exception : "+e);
		}
		System.out.println("The End ...");
		
	}

}
