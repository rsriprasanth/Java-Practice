package exercise;

public class SecondsAndMinutesChallenge {
	static int hours = 0;
	public static String getDurationString(int minutes, int seconds) {
		if(minutes>0 && (seconds>=0 || seconds<=60)) {
			if(minutes>60) {
				hours = minutes / 60;
				minutes = minutes % 60;
			}
			String totalHours =  hours + "h " + minutes + "m " + seconds + "s";
			return(totalHours);
		}
		return "Invalid Value";
	}
	
	public static String getDurationString(int seconds) {
		if(seconds>0) {
			int minutes = seconds / 60;
			seconds = seconds % 60;
			return getDurationString(minutes, seconds);
		}	
		return "Invalid Value";
	}
	public static void main(String[] args) {
		String time = getDurationString(90, 40);
		String secondsTime = getDurationString(10000); 
		System.out.println(time);
		System.out.println(secondsTime);
	}
}
