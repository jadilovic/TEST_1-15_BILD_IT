package Zadaci;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter 5 integers");
		int[] nums = new int[5];
		Scanner input = new Scanner(System.in);
	
		for(int i = 0; i < nums.length; i++){
			nums[i] = input.nextInt();
		}
		
		System.out.println("Please enter number X");
		int numX = input.nextInt();
		input.close();
		
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i] + nums[j] == numX)
					System.out.println("(" + nums[i] + ", " + nums[j] + ")");
			}
		}
	}
}
