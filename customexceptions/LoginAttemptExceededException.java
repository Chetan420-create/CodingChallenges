package customexceptions;

import java.util.Scanner;

public class LoginAttemptExceededException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 1234;
		
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Enter password : ");
				int inputpassword = sc.nextInt();
				if(inputpassword == password) {
					System.out.println("You login succssfully !");
					break;
				}else if(inputpassword != password && i==2) {
					throw new LoginAttemptExp("Account is blocked");
				}
			}
			
			
		}catch(LoginAttemptExp e) {
			e.printStackTrace();
		}
	}

}

class LoginAttemptExp extends RuntimeException{
	public LoginAttemptExp (String msg) {
		super(msg);
	}
}
