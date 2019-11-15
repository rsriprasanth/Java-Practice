package exercise;

public class PrimeNumberExercise {
	static int count = 0;
	public static boolean isPrime(int number) {

		if(number==1 || number ==0) {
			return false;
		}
		
		for(int i = 2; i<= number/2; i++ ) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i);
				if(count == 10) {
					break;
				}
			}
			
		}
		
	}
}
