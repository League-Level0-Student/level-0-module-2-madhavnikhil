package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	String president = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(president);
	if(age >= 18) {
		JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
}
}
