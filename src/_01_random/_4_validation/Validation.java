//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
	

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		for (int i = 0; i < 10; i++) {
			Random number = new Random ();
			int valid = number.nextInt(4);
			if (valid == 4) {
				JOptionPane.showMessageDialog(null, "You are kind.");
			}
			
			else if (valid == 3) {
				JOptionPane.showMessageDialog(null, "You are brave");
			}
		 else if (valid == 2) {
				JOptionPane.showMessageDialog(null, "You are hardworking.");
			}
		 else if (valid == 1) {
			 JOptionPane.showMessageDialog(null, "You are intelligent.");
		 }
		 else if (valid == 0) {
			 JOptionPane.showMessageDialog(null, "Have a good day.");
		 }
		}
			
		
		
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}

