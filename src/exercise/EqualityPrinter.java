package exercise;

public class EqualityPrinter {
	public static void printEqual(int a, int b, int c) {
		if(a<0 || b<0 || c<0) {
			System.out.println("Invalid Value");
		}
		else if(a == b && b == c && c == a) {
			System.out.println("All numbers are equal");
		}
		
		else if(a!=b && b!=c && c!=a) {
			System.out.println("All numbers are different");
		}
		
		else if (a == b || b == c || c == a) {
			System.out.println("Neither all are equal or different");
		}
	}
	
	public static void main(String [] args) {
		printEqual(10, 10, 10);
		printEqual(10, 12, 10);
		printEqual(10, 11, 12);
		printEqual(-1, -2, -3);
	}
}
