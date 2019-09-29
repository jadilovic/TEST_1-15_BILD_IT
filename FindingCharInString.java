package Zadaci;

/*
 *  * By Jasmin Adilovic
 * Date: 27.09.2019
 * E-mail: adilovic79@yahoo.com
 * 
 * 4. Napisati program koji pita korisnika da unese string, a zatim pronalazi i ispisuje prvi karakter koji se ne
ponavlja u ostatku stringa.
Input:
bubble
Output:
u
 */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindingCharInString {

	public static void main(String[] args) {
	
		System.out.println("Please enter any string");
		Scanner input = new Scanner(System.in);
		String text = input.next();
		input.close();
		
		// Converting entered String to a new character array and creating List and Set
		char[] chars = text.toCharArray();
		List<Character> charList = new ArrayList<>();
		Set<Character> charSet = new LinkedHashSet<>();
		
		// Adding elements to the List and Set
		for(int i = 0; i < chars.length; i++){
			charList.add(chars[i]);
			charSet.add(chars[i]);
		}
		
		// Printing elements in the List and Set
		System.out.println("Elements in the list: " + charList);
		System.out.println("Elements in the Set : " + charSet);
		
		// Removing single Set elements contained in the List
		for(Character ch: charSet)
			charList.remove(ch);
		
		// Printing remaining elements in the List
		System.out.println("Remaining elements in List: " + charList);
		
		// Checking if elements from the Set are in the remaining list
		for(Character ch: charSet){
			if(!charList.contains(ch)){
				// Printing first single element not repeated in the String (initial List of characters)
				System.out.println("First single element not repeated in the String: " + ch);
				break;
			}
		}
	}
}
