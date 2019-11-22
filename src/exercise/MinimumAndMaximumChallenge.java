package exercise;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {
	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		boolean first = true;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number:");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				if(first) {
					first = false;
					min = number;
					max = number;
				}
				if(number>max) {
					max = number;
				}
				else if(number<min) {
					min = number;
				}
			} 
			else {
				break;
			}
			scanner.nextLine();
		}
		System.out.println("Min = " + min + " Max = " + max);
	}
}
