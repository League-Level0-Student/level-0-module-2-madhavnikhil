package _99_extra;

import javax.swing.JOptionPane;

public class StringRepeater {
	public static void main(String[] args) {
	String word = JOptionPane.showInputDialog("Enter a word.");
	String number = JOptionPane.showInputDialog("Enter a number");
	int num = Integer.parseInt(number);
	for (int i = 0; i < num; i++) {
		JOptionPane.showMessageDialog(null, word);
	}
	}

}
