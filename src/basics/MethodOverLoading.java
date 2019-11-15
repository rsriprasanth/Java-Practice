package basics;

public class MethodOverLoading {
	
	public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet>=0 || (inches>=0 && inches<=12)) {
			double cm = (feet * 30.48) + (inches * 2.54);
			System.out.println(feet + " feet" + inches + " inches" + " = " + cm + " centimenters");
			return cm;
		}
		return -1;
	}
	
	public static double calculateFeetAndInchesToCentimeters(double inches) {
		if(inches>=0) {
			double feet = inches/12;
			double remainderInches = inches%12;
			System.out.println(feet+ " feet " + remainderInches + " inches");
			return feet;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
	}
}
