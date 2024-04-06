package wrapper_class;

public class Example1 {
	public static void main(String[] args) {
		int a = 10;
		byte b = 5;
		short c = 5;
		float d =5.6f;
		long e = 6;
		double f = 7.789797;
		char g = 'c';
		String h= "Rohit";
		
//		converting the value from int to object
		Integer obja = new Integer(a);
		Byte objb = new Byte(b);
		Short objc = new Short(c);
		Float objd = new Float(d);
		Long obje = new Long(e);
		Double objf = new Double(f);
		character objg = new Character(g);
		String objh = new String(h);
		
		int a1 = obja.intValue();
		System.out.println(a1);
		
	}
}
