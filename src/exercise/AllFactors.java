package exercise;

public class AllFactors {
	public static void printFactors(int number) {
		if (number>=1) {
			int i = 1;
			while (i <= number) {
				if (number % i == 0) {
					System.out.println(i);
				}
				i++;
			} 
		}
		else {
			System.out.println("Invalid Value");
		}
	}
	
	public static void main(String[] args) {
		printFactors(10);
	}
}
