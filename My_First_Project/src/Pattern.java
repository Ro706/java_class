public class Pattern {
	public static void main(String[] args) {
		byte n = 4;
		for(int i = 0; i < n ; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		n= 3;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

