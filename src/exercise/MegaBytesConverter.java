package exercise;

public class MegaBytesConverter {

	static long mb = 0;
	public static void printMegaBytesAndKiloBytes(int kb) {
		int finalKb=kb%1024;
		if (kb>=0) { 
			mb = kb / 1024;
			System.out.println(kb + " KB = " + mb + " MB" + " and " + finalKb + " KB");
		}
		
		else {
			System.out.println("Invalid Value");
		}
	}
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2000);
	}
}
