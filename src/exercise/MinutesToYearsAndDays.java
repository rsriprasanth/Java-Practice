package exercise;

public class MinutesToYearsAndDays {
	public static void  printYearsAndDays(long minutes) {
		if (minutes>=0) {
			long hours = minutes / 60;
			long days = hours / 24;
			long years = days / 365;
			long remainingYears = days%365;
			days = hours % 24;
			System.out.println(minutes + " min = "+ years + " y and " + remainingYears + " d");
		}
		else{
		    System.out.println("Invalid Value");
		}
	}
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
	}
}
