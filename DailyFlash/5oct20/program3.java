
	import java.util.*;

	class MArrayaddtn {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of rows of array:");
			int m = sc.nextInt();

			System.out.print("Enter number of cols of array:");
			int n = sc.nextInt();

			int[][] marr1 = new int[m][n];
			int[][] marr2 = new int[m][n];
			int[][] marr3 = new int[m][n];

			System.out.println("Enter elements of matrix 1: ");
			for(int i=0;i<m;i++) {

				for(int j=0;j<n;j++) {

					marr1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter elements of matrix 2: ");
			for(int i=0;i<m;i++) {

				for(int j=0;j<n;j++) {

					marr2[i][j] = sc.nextInt();

					marr3[i][j]=marr1[i][j]+marr2[i][j];
				}
			}
			System.out.println("The third matrix is:  ");
			for(int i=0;i<m;i++) {

				for(int j=0;j<n;j++) {

					System.out.print(marr3[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
