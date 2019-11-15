package exercise;

public class InterestExercise {
	public static void calculateInterest(double amount) {
		for(int i=8;i>1;i--) {
			double interestAmount = (amount * i)/100;
			System.out.println(amount + " at " + i +"% interest = " + String.format("%.2f", interestAmount));
		}
	}
	
	public static void main(String[] args) {
		calculateInterest(5000);
	}
}
