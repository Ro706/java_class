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
		/*
		    * 
		  * *
		* * *
		 */
		for(int i = 1 ; i <=n+1 ; i++) {
			for(int k = i ; k < n+1; k++) {
				System.out.print("-");
			}
			for(int j = 0 ; j <i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int rows = 4; 
	    for (int i = 1; i <= rows; i++) { 
	      for (int j = rows - i; j > 0; j--) { 
	        System.out.print(" ");
	      }
	      for (int k = 1; k <= (2 * i - 1); k++) { 
	        System.out.print("*");
	      }
	      System.out.println(); 
	    }
	}
}

