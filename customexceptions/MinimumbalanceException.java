package customexceptions;

import java.util.Scanner;

public class MinimumbalanceException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int miniBalance = 1000;
		
		int amount = 2000;
		System.out.println("Enter withdrawl amount : ");
		int withdrawl = sc.nextInt();
		
		try {
			//condition
			if(withdrawl >= (amount - miniBalance)) {
				throw new MinimumBalanceExp("Insufficients Balance !");
			}
			amount = amount - withdrawl; 
			System.out.println("You Withdraw Successfully : ");
			System.out.println("Your current balance is "+amount);
		}catch(MinimumBalanceExp e) {
			e.printStackTrace();
		}
		
		
		
	}

}

class MinimumBalanceExp extends RuntimeException{
	public MinimumBalanceExp(String msg) {
		super(msg);
	}
}
