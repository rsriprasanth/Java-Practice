package exercise;

public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean status, int hourOfDay) {
		if (hourOfDay>=0 && hourOfDay<=24) {
			if ((hourOfDay > 22 || hourOfDay < 8) && status == true) {
				return true;
			} 
		}
		return false;
	}
	
	public static void main(String[] args) {
		shouldWakeUp(true, 5);
	}
}
