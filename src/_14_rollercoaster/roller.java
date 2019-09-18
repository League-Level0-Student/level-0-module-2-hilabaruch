package _14_rollercoaster;

import javax.swing.JOptionPane;

public class roller { public static void main(String[] args) {
	String a = JOptionPane.showInputDialog("how tall are you?");
int height=Integer.parseInt(a);
if(height<48) {
	JOptionPane.showMessageDialog(null," you need to grow first to go on a rollercoaster");
}
	if(height>48) {
		JOptionPane.showMessageDialog(null," you can go on the rollercoaster");
}

}}
