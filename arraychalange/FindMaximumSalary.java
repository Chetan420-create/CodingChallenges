package arraychalange;

import java.util.Scanner;

public class FindMaximumSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Number of employees
		System.out.println("Enter Number of Employees : ");
		int employee = sc.nextInt();
		
		//initialize array off salary
		int[] salary = new int[employee];
		
		//traversing array
		for(int i=0 ; i<employee;i++) {
			//taking values from user
			System.out.println("Enter salary of employee "+(i+1)+" : ");
			int integer = sc.nextInt();
			//adding values in an array
			salary[i] = integer;
		}
		
		int maxSalary = salary[0]; 
		
		for(int s : salary) {
			if(s>=maxSalary) {
				maxSalary = s;
			}
		}
		
		System.out.println("Hightest Salary : "+maxSalary);
		
		sc.close();

	}

}
