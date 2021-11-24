package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Karakterb {

	public static void main(String[] args) {
		String karTxt = showInputDialog("Tallkarakter");
		int tallKarakter = parseInt (karTxt);
		String karakter;
		switch (tallKarakter) {
		default: karakter = "Ugyldig karakter";
		if (tallKarakter<101 && tallKarakter>89)
		 karakter = "A";
		
		if (tallKarakter<90 && tallKarakter>79)
			karakter = "B";
		
		if (tallKarakter<80 && tallKarakter>59)
			karakter = "C";
		
		if (tallKarakter<60 && tallKarakter>49)
			karakter = "D";
		
		if (tallKarakter<50 && tallKarakter>39)
			karakter = "E";
		
		if (tallKarakter<40 && tallKarakter>-1)
			karakter = "F";
		
			showMessageDialog(null,karakter);
	
		}
		}
	}
