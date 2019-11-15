package basics;

import java.util.Scanner;

public class ScannerClassesEg {
	public static String ageEligibility(int age){
        return(age>18 ? "Eligible" : "Not Eligible");
    }
        
    
	public static void printInfo(String name, int age, String eligibility ) {
		System.out.println("Hi " +  name + " you are " + age+ " years old and you are " + eligibility );
	}
    
    
    public static void main(String []args){
    	int age=0;
    	String name="";
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter your age");
		age=scanner.nextInt();
		scanner.nextLine();
    	
    	System.out.println("Enter your name");
    	name= scanner.nextLine();
		
		scanner.close();
    	String eligibility = ageEligibility(age);
    	printInfo(name, age, eligibility);
       
    }
}
