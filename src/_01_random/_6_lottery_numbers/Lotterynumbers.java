package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
public static void main(String[] args) {
	Random Dudley = new Random ();
	int Randy1 = Dudley.nextInt(80);
	int Randy2 = Dudley.nextInt(80);
	int Randy3 = Dudley.nextInt(80);
	int Randy4 = Dudley.nextInt(80);
	int Randy5 = Dudley.nextInt(80);
	int Randy6 = Dudley.nextInt(80);
	JOptionPane.showMessageDialog(null, Randy1 + " "  + Randy2 + " " + Randy3 + " " + Randy4 + " " + Randy5 + " " + Randy6 + " ");
}  

}

