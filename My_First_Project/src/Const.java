
public class Const {
	private float rate;
	private String name;
	private long phone;
	public Const() {
		this.rate = 9.10f;
		this.name = "value is not available";
		System.out.println("rate "+rate);
		System.out.println("Name "+name);
		System.out.println("Inside Default constructor of class Const");
	}
	
	public Const(float rate ,String name) {
		this.rate = rate;
		this.name = name;
		System.out.println("Inside Parameterized constructor of class Const");
	}
	
	public void Constget() {
		System.out.println("rate "+rate);
		System.out.println("Name "+name);
	}
	
	public static void main(String[] args) {
		Const c1 = new Const();
		Const c2 = new Const(10.11f,"Ro706");
		c1.Constget();
		c2.Constget();
	}
}
