package exercise;

import java.util.Scanner;

public class ReadingUserInputChallenge {
	
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		while (true) {
			int order = count +1;
			System.out.println("Enter a number # "+ order + ":");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				count++;
				sum += number;
				if(count == 10) {
					break;
				}
			} 
			else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine();
		}
		System.out.println("Sum " + sum);
		scanner.close();
	}
}
