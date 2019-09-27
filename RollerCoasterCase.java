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
		
		System.out.println("Please enter a short sentence:");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		input.close();
		
		int count = 1;
		char[] charList = sentence.toCharArray();
		String newSentence = "";
		
		// Going through characters in the Sentence
		for(int i = 0; i < charList.length; i++){
			if(charList[i] >= 'A' && charList[i] <='Z' || charList[i] >= 'a' && charList[i] <='z'){
				if(count % 2 != 0){
					charList[i] = Character.toUpperCase(charList[i]);
				}
				else if(count % 2 == 0){
					charList[i] = Character.toLowerCase(charList[i]);
				}
				count++;
			}
			newSentence += charList[i];
		}
		System.out.println(newSentence);
	}

}
