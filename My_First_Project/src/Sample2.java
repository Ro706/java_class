
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ro706" ;
		System.out.println("Hello ,"+name);
		long rollno = 22070521075l;
		System.out.println("your roll number: "+rollno);
		String college = "Sysmbiosis institute of technology";
		System.out.println("collage name is "+college);
		float marks = 9.95f;
		System.out.println("Your GPA is "+marks);
	    
	    System.out.println();
	    //printing 0 to 5
	    for(int i =0;i<5;i++) {
	    	System.out.println(i);
	    }
	    
	    System.out.println();
	    //printing 1 to 10 number 
	    for(int i = 1;i<11;i++) {
	    	System.out.println(i);
	    }
	    
	    System.out.println();
	    //2 table
	    int number = 2;
	    for(int i = 1;i<=10;i++) {
	    	System.out.println(number +"*"+i+"="+number*i);
	    }
	    
	    System.out.println();
		//lower right angle triangle
		for(int i = 0;i<3;i++) {
			for(int j = i;j<3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//replace the * with j or
		/*
		 1 
		 1 2 
		 1 2 3 
		 */
		for (int i = 1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		 111
		 222
		 333
		 */
		 System.out.println();
		 //printing the above pattern
		 for(int i = 1;i<=3;i++) {
			 for(int j = 1;j<=3;j++) {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
		 
		System.out.println();
		//right angle triangle
	    for(int i =0 ;i<=3;i++) {
	    	for(int j =0;j<i;j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println();
	    //pyramid code
	    int rows = 5; 
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
