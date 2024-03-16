public class Rectangle extends Shape {
	private double length = 10;
	private double breath = 20;
	private double total_area;
	public void area() {
		total_area = length*breath;
	}
	public void ShowArea(){
		System.out.println("Area of Rectangle : "+total_area);
	}
}
