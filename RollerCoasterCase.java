package Zadaci;

import java.util.Scanner;

/*
 * By Jasmin Adilovic
 * Date: 27.09.2019
 * E-mail: adilovic79@yahoo.com
 * 
1. Napisati program koji kao argument prima jednu reèenicu te vraæa tu istu reèenicu u RoLlEr CoAsTeR
caseu.
Input:
To be, or not to be: that is the question.
Output:
To Be, Or NoT tO bE: tHaT iS tHe QuEsTiOn.
*/

public class RollerCoasterCase {

	public static void main(String[] args) {
		
		// Asking user to enter short sentence
		System.out.println("Please enter a short sentence:");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		input.close();
		
		// Converting entered sentence to Character array
		char[] charArray = sentence.toCharArray();
		
		// Going through characters in the Sentence and making upper or lowwer case letters
		sentence = toUpperLowerCase(charArray);

		// Printing new sentence
		System.out.println(sentence);
	}

	// Method converting letters in sentence to lower or upper case
	private static String toUpperLowerCase(char[] charArray) {
		int count = 1;
		String newSentence = "";
		for(int i = 0; i < charArray.length; i++){
			if(charArray[i] >= 'A' && charArray[i] <='Z' || charArray[i] >= 'a' && charArray[i] <='z'){
				if(count % 2 != 0){
					charArray[i] = Character.toUpperCase(charArray[i]);
				}
				else if(count % 2 == 0){
					charArray[i] = Character.toLowerCase(charArray[i]);
				}
				count++;
			}
			newSentence += charArray[i];
		}
		return newSentence;
	}

}
