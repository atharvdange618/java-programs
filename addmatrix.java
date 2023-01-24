import java.util.*;

/*
1 Identify and design a methods main class arr add

2 Input number of rows and columns for two dimensional matrix.

3 Create three arrays as a, b and c as objects, with two dimensional rows and columns entered above

4 Input elements for matrix a and b 

5. Use Loop through the arrays a and b, add the corresponding elements e gabu

6 Store result of addition in matrix c

7 Display matrix.c
*/

class addmatrix {
	public static void main(String args[]) {
		int row, col, i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = in.nextInt();
		System.out.println("Enter the number of columns");
		col = in.nextInt();

		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];

		System.out.println("Enter the element of matrix 1 ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				mat1[i][j] = in.nextInt();
			}
		}

		System.out.println("Enter the element of matrix 2 ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				mat2[i][j] = in.nextInt();
			}
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {

				res[i][j] = mat1[i][j] + mat2[i][j];
			}
		}

		System.out.println("Sum of matrices: ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++)
				System.out.print(res[i][j] + "\t");
			System.out.println();

		}

	}// main

}// class