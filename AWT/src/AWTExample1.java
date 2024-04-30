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
		Button bb = new Button("Click Clock");
		bb.setBounds(190,100,80,30);//(x,y,width,height)
		add(bb);
		Button bf = new Button("Click food button");
		bf.setBounds(100,170,120,30);//(x,y,width,height)
		add(bf);
		Button bc = new Button("Click bhai");
		bc.setBounds(220,170,80,30);//(x,y,width,height)
		add(bc);
	}
	public static void main(String[] args) {
		AWTExample1 f = new AWTExample1("Click me !!");
	}

}
