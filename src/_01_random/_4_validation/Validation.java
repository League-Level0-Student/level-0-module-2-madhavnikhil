//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		
			
		
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You are very hardworking.");
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are very kind.");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are very intelligent.");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are very brave.");
		}
		if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are very handsome.");
			
		}
		if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You are very courageous.");
		}
		}
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
