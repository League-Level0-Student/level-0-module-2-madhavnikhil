package _01_random._1_intro_to_random;



import java.lang.annotation.Repeatable;
import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
	    System.out.println(random);
	    	
		
		// 11. Repeat until step 10 ten times
	       for (int i = 0; i < args.length; i++) {
			
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
     String Input = JOptionPane.showInputDialog("Guess a number.");
			// 4. Convert the users answer to an int (Integer.parseInt(string))
			
			int Weasley = Integer.parseInt(Input);
			
			
		
			// 5. if the guess is correct
           if (Weasley == random) {
			JOptionPane.showMessageDialog(null, "win");
		}
        		   
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		
		
			// 7. if the guess is high
				// 8. Tell them it's too high
           if (Weasley > random) {
			JOptionPane.showMessageDialog(null, "It's too high.");
		}
		
		
		
			// 9. if the guess is low
				// 10. Tell them it's too low
           if (Weasley < random) {
        	   JOptionPane.showMessageDialog(null, "It's too low.");
           }
           
	       }
		}

		
		
		// 13. Tell them they lose
		
	}

}


