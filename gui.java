import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class gui extends JFrame{

	
	
	JPanel jp = new JPanel();
	
	JLabel fn = new JLabel();
	JLabel mi = new JLabel();
	JLabel ln = new JLabel();
	JTextField fn_tf = new JTextField(30);
	JTextField mi_tf = new JTextField(30);
	JTextField ln_tf = new JTextField(30);
public gui()
{
setTitle("CONTACTS MANAGER");
setVisible(true);
setSize(960,960);
setDefaultCloseOperation(EXIT_ON_CLOSE);

jp.setLayout(new FlowLayout(-2,120,100));

fn = new JLabel("First Name");
fn.setBounds(0, 0, 300, 500);
jp.add(fn);
fn_tf.setBounds(100, 200, 100, 200);
jp.add(fn_tf);

mi = new JLabel("M.I.", JLabel.CENTER);
//mi.setForeground(Color.blue);
mi.setBounds(20, 30, 120, 220);
jp.add(mi);

jp.add(mi_tf);


ln = new JLabel("Last Name");
jp.add(ln);

jp.add(ln_tf);

add(jp);
}

public static void main (String args[])
{
	gui t= new gui();
	
}

}