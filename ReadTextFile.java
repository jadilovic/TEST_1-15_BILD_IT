package Zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * By Jasmin Adilovic
 * Date: 27.09.2019
 * E-mail: adilovic79@yahoo.com
 * 
3. Napisati program koji èita rijeèi iz tekstualnog filea te ispisuje iste te rijeèi u rastuæem abecednom redu.
Program treba da pita korisnika da unese ime filea, te:
a. da li korisnik želi da ispiše sve rijeèi, ukljuèujuæi duplikate.
b. da li korisnik želi da ispiše samo unikatne rijeèi, ne ukljuèujuæi duplikate.
*/

public class ReadTextFile {

	public static void main(String[] args) {
		System.out.println("Please enter the name of the file:");
		Scanner input = new Scanner(System.in);
		String fileName = input.next();
		
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("Entered file does not exisit");
			System.exit(0);
		}
		
		List<String> allWords = new ArrayList<>();
		Scanner read;
		try {
			read = new Scanner(file);
			while(read.hasNext()){
				allWords.add(read.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("If you would like to read and write all words including \nduplicates"
				+ " enter number '1', for only unique words enter '2'");
		int selection = input.nextInt();
		input.close();
		
		switch(selection){
		case 1: sortAllWords(allWords);
		break;
		case 2: makeUniqueWordsSet(allWords);
		break;
		}
	}

	private static void makeUniqueWordsSet(List<String> allWords) {
		Set<String> uniqueWords = new TreeSet<>();
		for(String word: allWords)
			uniqueWords.add(word);
		print(uniqueWords);
		}

	private static void sortAllWords(List<String> allWords) {
		Collections.sort(allWords);
		print(allWords);
	}
	
	private static void print(Collection<String> words) {
		for(String word: words)
			System.out.println(word);
	}
}
