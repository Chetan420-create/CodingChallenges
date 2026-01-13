package customexceptions;

import java.util.Scanner;

public class InvalidAgeException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		try {
			
			if(age < 21 || age > 35) {
				throw new InvalidAgeExp("Invalid Age !");
			}
			
			System.out.println("Valid age");
			
		}catch(InvalidAgeExp e ) {
			e.printStackTrace();
		}

	}

}

class InvalidAgeExp extends RuntimeException{
	public InvalidAgeExp(String msg) {
		super(msg);
	}
}