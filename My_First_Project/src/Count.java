
public class Count {
	static int count ;
	private Count(){
		count++;
	}
	public void createInstance() {
		
		Count obj = new Count(); 
	}
	public static void ShowCount() {
		System.out.println("count = "+ count);
	}
}
