package exercise;

public class SpeedConverter {
	 public static long toMilesPerHour(double kilometersPerHour){

	        if(kilometersPerHour<0) {
	            return -1;
	        }
	        //Conversion kmph to mph - Divide by 1.609
	        double milesPerhour = kilometersPerHour/(1.609);
	        return(Math.round(milesPerhour));
	    }

	    public static void printConversion(double kilometersPerHour){
	        if(kilometersPerHour < 0){
	            System.out.println("Invalid Value");
	        } else{
	            long milesPerHour = toMilesPerHour(kilometersPerHour);
	            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
	        }
	    }
	    public static void main(String[] args) {
	        printConversion(50);
	    }
}
