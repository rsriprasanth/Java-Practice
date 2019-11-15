package exercise;

public class NumberPalindrome {
	public static boolean isNumberPalindrome(int number) {
		number = Math.abs(number);
		int number1 = number; 
		int reverse =0;
		while(number1>0) {
			reverse = (number1 % 10) + (reverse*10);
			number1/=10;
		}
		return true;
	}
}
