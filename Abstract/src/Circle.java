public class Circle extends Shape {
	private double radius=7;
	private float pi=3.14f;
	private double total_area;
	public void area() {
		total_area = pi*radius*radius;
	}
	public void ShowArea(){
		System.out.println("Area of circle : "+total_area);
	}
}
