package exercise;

public class FirstAndLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		int lastDigit;
		if (number>0) {
			lastDigit = number % 10;
			number /= 10;
			if(number<1) {
				return (lastDigit*2);
			}
			while (number >=10) {
				number /= 10;
			} 
			return (lastDigit+number);
		}
		return (-1);
	}
	
	public static void main(String []args) {
		System.out.println(sumFirstAndLastDigit(101));
	}
}
