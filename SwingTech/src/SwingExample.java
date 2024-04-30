import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SwingExample {
	JTextField txt_rollno,txt_name,txt_branch;
	JButton btn_save;
	JLabel lbl_name,lbl_rollno,lbl_branch;
	public SwingExample() {
		JFrame f = new JFrame();
		lbl_rollno = new JLabel("Roll No. : ");
		lbl_rollno.setBounds(50,50,100,50);
		
		txt_rollno = new JTextField();
		txt_rollno.setBounds(120,65,100,30);
		f.add(lbl_rollno);
		f.add(txt_rollno);
//		=======================================
		
		lbl_name = new JLabel("Name : ");
		lbl_name.setBounds(50,80,100,50);
		
		txt_name = new JTextField();
		txt_name.setBounds(120,100,100,30);
		
		f.add(lbl_name);
		f.add(txt_name);
//		=======================================
		lbl_branch = new JLabel("branch : ");
		lbl_branch.setBounds(50,120,100,50);
		
		txt_branch = new JTextField();
		txt_branch.setBounds(120,140,100,30);
		
		f.add(lbl_branch);
		f.add(txt_branch);
//		========================================
		
		btn_save = new JButton("click");
		btn_save.setBounds(120,230,150,20);
		f.add(btn_save);
		
//		========================================
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		SwingExample f = new SwingExample();

	}

}
