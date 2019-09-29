package Zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * By Jasmin Adilovic
 * Date: 27.09.2019
 * E-mail: adilovic79@yahoo.com
 * 
2. Napisati program koji pita korisnika da proslijedi ime filea. Nakon što je korisnik proslijedio ime filea,
program treba da ispiše nazad korisniku:
a. ukupan broj rijeèi u fileu
b. broj samoglasnika u fileu
c. broj suglasnik u fileu
 */
public class ReadCountWords {

	public static void main(String[] args) {
		
		System.out.println("Please enter the name of the file");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		input.close();
		
		// Checking if the file exists
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("File " + fileName + " does not exist");
			System.exit(0);
		}
		
		// Reading the file and saving the words in the ArrayList
		List<String> words = new ArrayList<>();
		words = readText(words, file);

		// Crating integer array to save number of Vowels and Consonants
		int[] countVowelsConsonants = new int[2];
		countVowelsConsonants = countEach(words);

		// Printing number of words, vowels and consonants in the text
		System.out.println("Total number of words in the file " + fileName + " is " + words.size());
		System.out.println("Total number of vowels in the file " + fileName + " is " + countVowelsConsonants[0]);
		System.out.println("Total number of consonants in the file " + fileName + " is " + countVowelsConsonants[1]);
	}

	// Method counting all vowels and consonants in the words
	private static int[] countEach(List<String> words) {
		int[] count = new int[2];
		int countVowels = 0;
		int countConsonants = 0;
		for(String word: words){
			word.toLowerCase();
			char[] charList = word.toCharArray();
			for(int i = 0; i < charList.length; i++){
				if(charList[i] >= 'a' && charList[i] <= 'z'){
					if(charList[i] == 'a' || charList[i] == 'e' || charList[i] == 'i' || charList[i] == 'o' || charList[i] == 'u'){
						countVowels++;
					}
					else
						countConsonants++;
				}
			}
		}
		count[0] = countVowels;
		count[1] = countConsonants;
		return count;
	}

	// Method reading the text and adding words to ArrayList
	private static List<String> readText(List<String> words, File file) {
		try {
			Scanner read = new Scanner(file);
			while(read.hasNext()){
				words.add(read.next());
			}
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return words;
	}
}


