
public class Student {
		private int rollno; //Instance variable
		private String name; //Instance variable
		private String branch; //Instance variable
		public void setStudent(int rollno,String name ,String branch) {
			this.rollno = rollno;
		
			this.name = name;
			this.branch = branch ;
		}
		public void getStudent() {
			System.out.println("Roll No "+rollno);
			System.out.println("Name "+name);
		System.out.println("Branch "+branch);
//		}
//		public int getRollno() {
//			return rollno;
//		}
//		public void setRollno(int rollno) {
//			this.rollno = rollno;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getBranch() {
//			return branch;
//		}
//		public void setBranch(String branch) {
//			this.branch = branch;
//		}
//		
}
