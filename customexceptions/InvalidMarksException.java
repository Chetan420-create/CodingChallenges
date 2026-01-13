package customexceptions;

import java.util.Scanner;

public class InvalidMarksException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input marks from user
					System.out.print("Enter Marks : ");
					double marks = sc.nextDouble();
					
		
		
		//handling exception
		try {
			// check condition
			if(marks >= 0 && marks <= 100) {
				System.out.println("Your marks are : "+marks);
				return;
			}
			//throw exception
			throw new InvalidMarksExp("The marks are out of range");
		}catch(InvalidMarksExp e) {
			e.printStackTrace();
		}
	}

}

class InvalidMarksExp extends RuntimeException{
	InvalidMarksExp(String msg){
		super(msg);
	}
	
}
