package arraychalange;

import java.util.Scanner;

public class CalculatesTotalMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of subjects : ");
		int std = sc.nextInt();
		int m[]=new int[std];
		for(int i=0;i<std;i++) {
			System.out.println("Enter mark of  subject "+(i+1)+" : ");
			int mark = sc.nextInt();
			sc.nextLine();
			m[i]=mark;
			
		}
		
		int total=0;
		
		for(int mark : m) {
			total += mark;
		}
		
		System.out.println("Total marks : "+total);
		sc.close();
	}
	

}
