package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Votingbooth {
public static void main(String[] args) {
	String Input = JOptionPane.showInputDialog("How old are you?");
int Marge = Integer.parseInt(Input); 
	if (Marge > 18) {
		JOptionPane.showInputDialog("Who do you vote for president?");
	}	
	
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think, you filthy little mudblood.");	
		
	}
    }
	}

