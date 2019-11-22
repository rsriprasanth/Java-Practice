package primitives;

import java.util.Scanner;

public class PrimitivePractice {
	static double kg;
	static double pounds;
	public static final double POUNDS_TO_KILOS = 0.453592 ;
	
	/**
	 * Conversion from pounds to kilograms
	 * @param pounds
	 * @return
	 */
	public static double convertPoundsToKilos(double pounds) {
		kg = pounds * POUNDS_TO_KILOS;
		return(kg);
	}
	
	public static void main(String[] args) {
		
		/**
		 * Byte, Short, Integer and Long
		 */
		byte byteVariable = 100;
		short shortVariable = 10000;
		int intVariable= 123456; //int and long more preferable(int is default)
		long longVariable = 50000 + 10*(byteVariable) + shortVariable + intVariable; 
		System.out.println("Byte Variable value: "+ byteVariable 
				+"\nShort Variable value: " + shortVariable 
				+"\nInteger Variable value: " + intVariable 
				+"\nLong Variable value: "+ longVariable + "\n");
		
		
		/** 
		 * float and double 32 and 64 bytes resp
		 * 
		 */
		int var = 20/3; 
		float floatVariable = 20f/3f; //not usually preferred 
		double doubleVariable = 20d/3d;//double is default
		System.out.println("Integer: " + var 
				+"\nFloat: " + floatVariable
				+"\nDouble: " + doubleVariable);
		
		/**
		 * Calling/ Invoking the convertPoundsToKilos method
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weigth of the package in pounds:");
		pounds = scanner.nextDouble(); 
		kg=convertPoundsToKilos(pounds);
		System.out.println("Kilograms: " + kg + "kgs");
		scanner.close();
	}
}
