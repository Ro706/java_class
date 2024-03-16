
public class AreaClaculation {
	public static void main(String[] args) {
		Shape s; //Reference of a abstract class
		s = new Circle();
		s.area();
		s.ShowArea();
		s = new Rectangle();
		s.area();
		s.ShowArea();
	}
}
