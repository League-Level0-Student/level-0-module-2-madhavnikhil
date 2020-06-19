package rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
		
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		String Input = JOptionPane.showInputDialog("Enter your height in inches in order to enter the Incredicoaster ride.");
        int Snape = Integer.parseInt(Input); 
        	
		// Uncomment the line below...
        	if( Snape > 48 ) {
			JOptionPane.showMessageDialog(null, "You are tall enough to ride the roller coaster alone if you are more introverted but you are still welcome to ride the roller coaster with someone if you are more extraverted");
		}
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
	
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
          else if(Snape > 42) {
        		JOptionPane.showMessageDialog(null, "You can still ride this roller coaster with someone who is at least 13 years old or is at least 60 inches tall.");
          }
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
        	if(Snape < 42) {   
        		JOptionPane.showMessageDialog(null, "You are not allowed to ride this roller coaster if you are under 42 inches. Now that you tried to be dangerous by trying to get into this ride under the height requirement you are permanently expelled from the whole Disneyland Resort which includes all the parks, Downtown Disney, and hotels.");
		} }	
 }