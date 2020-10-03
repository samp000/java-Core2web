
	import java.util.*;

	class MArray1 {

		public static void main(String args[]) {

			Scanner sc =new Scanner(System.in);

			System.out.print("Enter the number of rows: ");
			int rows = sc.nextInt();
			System.out.print("Enter the number of cols: ");
			int cols = sc.nextInt();

			int[][] marr = new int[rows][cols];
			for(int i=0;i<rows;i++) {

				for(int j=0;j<cols;j++) {

					marr[i][j] = sc.nextInt();
				}
			}

			System.out.println("Matrix is: ");
			for(int i=0;i<rows;i++) {

				for(int j=0;j<cols;j++) {

					System.out.print(marr[i][j] +" ");
				}
				System.out.println();
			}

			System.out.println("Digonal elements are: ");

			for(int i = 0;i<rows;i++) {
				if(i>=cols)
					break;

				System.out.print(marr[i][i] +" ");
			}

			System.out.println();
		}
	}

