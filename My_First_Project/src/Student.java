
public class Student {
		private int rollno; //Instance variable
		private String name; //Instance variable
		private String branch; //Instance variable
		public void setStudent(int roll,String names ,String branchs) {
			rollno = roll;
			name = names;
			branch = branchs ;
		}
		public void getStudent() {
			System.out.println("Roll No "+rollno);
			System.out.println("Name "+name);
			System.out.println("Branch "+branch);
		}
}
