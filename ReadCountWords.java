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
		
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("File " + fileName + " does not exist");
			System.exit(0);
		}
		
		List<String> words = new ArrayList<>();
		
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
		System.out.println("Total number of words in the file " + fileName + " is " + words.size());
		System.out.println("Total number of vowels in the file " + fileName + " is " + countVowels);
		System.out.println("Total number of consonants in the file " + fileName + " is " + countConsonants);
	}
}


