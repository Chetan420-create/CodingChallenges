package TwoDarray;

public class Task3 {

	public static void main(String[] args) {
		// Check weather the give matrix is identity matrix 
		
		//initialize the array
			int matrix[][] = {
					{1,0,0},
					{0,1,0},
					{0,0,1}
				};
			
//			assuming diagonal element are 1 is true and remaining are zero is true
			boolean checkdiagonal = true;
			boolean otherelement = true;
			
			//outer loop for row
			for(int r  = 0;r<3;r++) {
				//inner loop for column
				for(int c = 0 ;c<3 ;c++) {
//					check the index are equal or not
					if(r==c) {
//						check diagonal element are not equal to 1
						if(matrix[r][c]!=1) {
							checkdiagonal = false;
						}
					}else {
//						check other element are not equal to 0
						if(matrix[r][c]!=0) {
							otherelement = false;
						}
					}
					
				}
			}
			
			
//			check diagonal element are 1 and other element are 0
			if(otherelement && checkdiagonal) {
				System.out.println("The given matrix is identity matrix");
			}else {
				System.out.println("The given matrix is NOT identity matrix");
			}
				
	}

}
