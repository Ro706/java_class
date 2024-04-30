import java.awt.*;
public class AWTExample1 extends Frame {
	AWTExample1(String a){
		System.out.println("Inside constructor");
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setTitle("This is our basic AWT Example");
		Button b = new Button(a);
		b.setBounds(100,100,80,30);//(x,y,width,height)
		add(b);
		setLayout(null);
		setVisible(true);
		Button bb = new Button("Click Clock");
		bb.setBounds(190,100,80,30);//(x,y,width,height)
		add(bb);
	}
	public static void main(String[] args) {
		AWTExample1 f = new AWTExample1("Click me !!");
	}

}
