
	import java.util.*;

	class MArray2 {

		public static void main(String args[]) {

			Scanner sc =new Scanner(System.in);

			System.out.print("Enter no of plane:");
			int plane = sc.nextInt();
			System.out.print("Enter no of rows: ");
			int rows = sc.nextInt();
			System.out.print("Enter no of cols: ");
			int cols = sc.nextInt();


			int[][][] marr = new int[plane][rows][cols];

			for(int i =0;i<plane;i++) {

				for(int j=0;j<rows;j++){

					for(int k=0;k<cols;k++)
						marr[i][j][k] = sc.nextInt();
				}
			}


			for(int i =0;i<plane;i++) {

				if(i==0)
					System.out.println("First plane");
				if(i==1)
					System.out.println("Second plane");

				for(int j=0;j<rows;j++){

					for(int k=0;k<cols;k++)
						System.out.print(marr[i][j][k] +" "); 
					System.out.println();
				}
			}


		}
	}
