
	import java.util.*;

	class M3DArray5Divisible {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter no of planes:");
			int pl = sc.nextInt();

			System.out.print("Enter no of rows:");
			int rows = sc.nextInt();

			System.out.print("Enter no of columns:");
			int cols = sc.nextInt(),sum=0;

			int[][][] arr = new int[pl][rows][cols];
			System.out.println("Enter elements: ");

			for(int i=0;i<pl;i++) {

				for(int j=0;j<rows;j++) {

					for(int k=0;k<cols;k++) {

						arr[i][j][k] = sc.nextInt();
					}
				}
			}


			System.out.println("Numbers Divisible by 5 are: ");
			for(int i=0;i<2;i++) {	
				for(int j=0;j<rows;j++) {

					for(int k=0;k<cols;k++) {

						if(arr[i][j][k]%5==0)
						System.out.print(arr[i][j][k] +" ");
					}
				}
			}
			System.out.println();
		}
	}
