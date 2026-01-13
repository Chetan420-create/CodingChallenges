package customexceptions;

import java.util.Scanner;

public class TransactionLimitExceedException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double maxTransaction = 50000;
		
		try {
			while(true) {
				System.out.println("Enter Transaction Amount : ");
				int transactionAmount = sc.nextInt();
				if(maxTransaction <= transactionAmount) {
					throw new TransactionLimitExp("Transaction amount is out of limit your one day trasaction limit is now  "+maxTransaction);
					
				}
				
				maxTransaction = maxTransaction -  transactionAmount;
				System.out.println("You have succssfully transact your transaction amount "+ transactionAmount);
				
				System.out.println("Do you want to continue transaction (y/n)");
				String C = sc.nextLine();
				sc.nextLine();
				if(C=="y") {
					break;
				}
			}
		}catch(TransactionLimitExp e) {
			e.printStackTrace();
		}
		
	}

}

class TransactionLimitExp extends RuntimeException{
	TransactionLimitExp(String msg){
		super(msg);
	}
	
}
