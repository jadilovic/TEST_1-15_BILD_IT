package Zadaci;

/*
 *  * By Jasmin Adilovic
 * Date: 27.09.2019
 * E-mail: adilovic79@yahoo.com
 * 
 * 5. Napisati program koji pita korisnika da unese niz od 5 cijelih brojeva i broj X, a zatim ispisuje sve parove
brojeva iz niza èija je suma jednaka broju X.
Input:
Unesite niz: 1 2 3 4 6
Unesite broj x: 5
Output:
(1,4)
(2,3)
 */

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		// Entering an array of integer numbers
		System.out.println("Please enter 5 integers");
		int[] nums = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < nums.length; i++){
			nums[i] = input.nextInt();
		}
		
		// Entering number X
		System.out.println("Please enter number X");
		int numX = input.nextInt();
		input.close();
		
		// Finding two numbers from the array whose sum is equal to number X
		findTwoNumbers(nums, numX);
	}

	// Method for finding two numbers whose sum is equal to X number
	private static void findTwoNumbers(int[] nums, int numX) {
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] + nums[j] == numX)
					System.out.println("(" + nums[i] + ", " + nums[j] + ")");
			}
		}
	}
}
