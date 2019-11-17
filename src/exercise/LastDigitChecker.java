package exercise;

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int a, int b, int c) {
		if (isValid(a) && isValid(b) && isValid(c)) {
			int lasta = a % 10;
			int lastb = b % 10;
			int lastc = c % 10;
			if (lasta == lastb || lastb == lastc || lastc == lasta) {
				return true;
			} 
		}
		return false;
	}
	
	public static boolean isValid(int num) {
		if(num>=10 && num<=1000) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
		System.out.println(hasSameLastDigit(41, 22, 71));
	}
}
