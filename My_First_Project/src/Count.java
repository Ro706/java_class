// singleton pattern
public class Count {
	static int count ;
	private Count(){
		count++;
	}
	public static  void createInstance() {
		
		Count obj = new Count(); 
		System.out.println("Instance Created.... ");
	}
	public static void ShowCount() {
		System.out.println("count = "+ count);
	}
}
