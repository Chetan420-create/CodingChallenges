package TwoDarray;

public class Task4 {

	public static void main(String[] args) {
		// Multiplication of two matrix
		
		// first matrix
		int m1[][] = {
				{1,2},
				{3,4}
		};
		
		//second matrix
		int m2[][] = {
				{5,6},
				{7,8}
		};
		
		//matrix to store the new matrix element
		int m3[][] = new int[2][2];
		
		// loop for row 
		for(int r =0;r<2;r++) {
			//loop for column
			for(int c=0;c<2;c++) {
//				initializing e to store each element of new matrix 
				int e = 0;
				//loop for matrix multiplication
				for(int k=0;k<2;k++) {
					e += m1[r][k] * m2[k][c]; //multiplication of first row * first column , 1st r * 2nd * c , 2nd r * 1st c , 2nd r * 2nd c	
				}
//				adding elements in new matrix m3
				m3[r][c] = e; 
			}
		}
		
		//print new array matrix
		for(int r=0;r<2;r++) {
			for(int c=0;c<2;c++) {
				System.out.print(" | "+m3[r][c]+" | ");
			}
			System.out.println();
		}
	}

}
