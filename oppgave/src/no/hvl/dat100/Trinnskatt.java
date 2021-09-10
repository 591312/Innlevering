package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Trinnskatt {

	public static void main(String[] args) {
		String lonnTxt = showInputDialog("Din bruttoinntekt:");
		int lonn = parseInt(lonnTxt);
		double trinnskatt = 0;
		
		if (lonn<164101) 
		trinnskatt = 0;
		
		else {
			if (lonn>164100 && lonn<230951) {
				trinnskatt = (lonn/100) * 0.93; 
			}			
		}
		
		if (lonn>230960 && lonn<580651) {		
			trinnskatt = (lonn/100) * 2.41 ;
		}
		if (lonn>580652 && lonn<934050) {		
			trinnskatt = (lonn/100) * 11.52 ;
		}
		if (lonn>934052) {		
			trinnskatt = (lonn/100) * 14.52 ;
		}
		
	
		String utTxt = "Trinnskatt: " + trinnskatt;
		showMessageDialog(null, utTxt);
	}
}
