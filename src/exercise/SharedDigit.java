package exercise;

public class SharedDigit {
	public static boolean hasSharedDigit(int a, int b) {
		boolean sharedDigit = false;
		if((a>=10 && a<=99) && (b>=10 && b<=99)) {
			while(a>10 && b>10) {
				int da = a % 10;
				int db = b % 10;
				int da1= a/10;
				int db1= b/10;
				a=a/10;
				b=b/10;
				if(da==db || da==db1 || da1==db1 ||da1==db) {
					sharedDigit =true;
				}
			}
			return sharedDigit;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(11, 32));
		
	}
}
