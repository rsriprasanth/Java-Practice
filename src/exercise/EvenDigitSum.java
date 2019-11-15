package exercise;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		int newNumber;
		int evenDigitSum=0;
		if (number>=0) {
			while (number > 0) {
				int digit= number%10;
				newNumber = number % 2;
				if(newNumber==0) {
					evenDigitSum += digit;
				}
				number /= 10;
			}
			return evenDigitSum;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(252));
	}
}
