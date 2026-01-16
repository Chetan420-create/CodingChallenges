package TwoDarray;

public class Task5 {

	public static void main(String[] args) {
		// Print element of the matrix in spiral order
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int top = 0;
        int bottom = 2;
        int left = 0;
        int right = 2;

        System.out.println("Spiral order : ");

        while (top <= bottom && left <= right) {

//             Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

//             Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left along the bottom row if is allow
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top along the left column if it is applicable
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();

	}

}
