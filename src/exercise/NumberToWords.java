package exercise;

public class NumberToWords {
	static String numberToWords;
	public static void getNumberToWords(int number) {
		int numberWord=0;
		for(int i=10;i>0;i++) {
			numberWord = number%10;
			number/=10;
			switch(numberWord) {
			case 0: System.out.println("Zero");
			break;
			case 1: System.out.println("One");
			break;
			case 2: System.out.println("Two");
			break;
			case 3: System.out.println("Three");
			break;
			case 4: System.out.println("Four");
			break;
			case 5: System.out.println("Five");
			break;
			case 6: System.out.println("Six");
			break;
			case 7: System.out.println("Seven");
			break;
			case 8: System.out.println("Eight");
			break;
			case 9: System.out.println("Nine");
			break;
			}
		}
		
	}
	public static void main(String[] args) {
		getNumberToWords(126);
	}
}
