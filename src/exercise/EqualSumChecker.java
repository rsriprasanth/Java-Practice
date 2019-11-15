package exercise;

public class EqualSumChecker {
	public static boolean hasEqualSum(int a, int b, int c) {
		
		if(a+b==c) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		hasEqualSum(3, 6, 9);
	}
}
