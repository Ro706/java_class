import java.util.Scanner;
public class Scanme {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = in.nextLine();
		System.out.print("Name is "+name);
		in.close();

	}

}
