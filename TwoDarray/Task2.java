package TwoDarray;

					
public class Task2 {

	public static void main(String[] args) {
		//Largest element in each row of a matrix
		
		//initialize the array
		int matrix[][] = {
				{3,10,5},
				{7,2,8},
				{4,16,9}
		};
		
		//initialize max element array
		int max[] = {matrix[0][0],matrix[1][0],matrix[2][0]};
		
		//outer loop for row
		for(int r=0;r<3;r++) {
			
			//inner loop for column
			for(int c=0 ; c<3;c++) {
				
				//check greater number
				if(matrix[r][c]>max[r]) {
					max[r] = matrix[r][c]; //add greater number 
				}
			}
		}
		
		//print large element in an array
		for(int k=0 ; k<max.length;k++) {
			System.out.println(max[k] );
		}
	}

}
