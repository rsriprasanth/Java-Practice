package exercise;

public class GreatestCommonDivisor {
	/**Complex Way*/
	public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
		if (firstNumber >= 10 && secondNumber >= 10) {
			if (firstNumber > secondNumber && (firstNumber % secondNumber == 0)) {
				return secondNumber;
			}

			else if (secondNumber > firstNumber && (secondNumber % firstNumber == 0)) {
				return firstNumber;
			}
			int i = 1;
			int gcd = 0;
			while (i < firstNumber && i < secondNumber) {
				while (firstNumber % i == 0 && secondNumber % i == 0) {
					gcd = i;
					i++;
				}
				i++;
			}
			return gcd;
		}
		return (-1);
	}
	
	/**Easiest Way*/
	public static int gCD(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return firstNumber;
		}
		return gCD(secondNumber, firstNumber % secondNumber);
	}
	public static void main(String[] args) {
		System.out.println(gCD(12, 30));
	}
}