
	import java.util.*;

	class MArrayeven {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter number of rows of array:");
			int m = sc.nextInt();

			System.out.print("Enter number of cols of array:");
			int n = sc.nextInt();

			int[][] marr = new int[m][m];
			int smevn = 0 , mxodd=0;

			for(int i=0;i<m;i++) {

				for(int j=0;j<n;j++) {

					marr[i][j] = sc.nextInt();

					if(marr[i][j]%2==0)
						smevn=smevn+marr[i][j];

					if(marr[i][j]%2!=0 && marr[i][j]>mxodd)
						mxodd = marr[i][j];
				}
			}


			System.out.print("Sum of even numbers elements: "+smevn +"\n");
			System.out.print("Max odd  elements: "+mxodd+"\n");
			System.out.print("Expected output: "+(smevn*mxodd)+"\n");
		}
	}
