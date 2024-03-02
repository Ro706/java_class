
public class SingleInheritance {

	public static void main(String[] args) {
		Demo2 obj1 = new Demo2();
		obj1.ShowDemo();
		obj1.ShowDemo2();
		obj1.setA(2);
		obj1.setB(5);
		System.out.println("class Demo a = "+ obj1.getA());
		System.out.println("class Demo2 b = "+ obj1.getB());
		
	}

}
