package exercise;

public class Sum3And5Challenge {
	public static int sum3And5(int num) {
		if(num%3 == 0 && num%5 == 0) {
			return num;
		}
		return(-1);
	}
	
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for(int i=1;i<1000;i++) {
			if(sum3And5(i)!=-1) {
				sum = sum+i;
				count++;
				System.out.println(i);
				if(count==5) {
					break;
				}
			}
		}
		System.out.println("Sum = " + sum);
	}
}
