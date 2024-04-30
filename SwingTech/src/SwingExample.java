import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingExample implements ActionListener{
	JTextField txt_rollno,txt_name,txt_branch;
	JButton btn_save;
	JLabel lbl_name,lbl_rollno,lbl_branch;
	public SwingExample() {
		JFrame f = new JFrame();
		lbl_rollno = new JLabel("Roll No. : ");
		lbl_rollno.setBounds(50,50,100,50);
		txt_rollno = new JTextField();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		SwingExample f = new SwingExample();

	}

}
