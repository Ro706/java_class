import java.util.Scanner;
public class Scanme {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = in.nextLine();
		System.out.print("Enter a college name : ");
		String college_name = in.nextLine();
		System.out.print("Enter your roll no : ");
		String roll = in.nextLine();
		int newroll = Integer.parseInt(roll);
		System.out.println("Name is "+name);
		System.out.println("College Name is "+college_name);
		System.out.println("roll no is "+newroll);
		in.close();

	}

}
