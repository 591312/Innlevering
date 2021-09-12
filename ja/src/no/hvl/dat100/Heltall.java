package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Heltall {

public static void main(String[] args) {
	String heltallTxt = showInputDialog("n! ");
	int heltall = parseInt(heltallTxt);
	int n = heltall;
	
	if (heltall>0) 
	n = (n-1) * n;
	
	String utTxt = ("n!" + n);
	showMessageDialog(null, utTxt);
}
}