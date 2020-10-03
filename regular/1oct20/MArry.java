	import java.io.*;
	import java.util.*;
	class MArrayDemo {

		public static void main(String args[]) throws IOException{

			Scanner sc =new Scanner(System.in);
		//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int[][] marr = new int[3][3];

			for(int i=0;i<3;i++) {

				for(int j=0;j<3;j++) 
					marr[i][j]=sc.nextInt();		
			}


			for(int i=0;i<3;i++) {

				for(int j=0;j<3;j++) 
					System.out.print(marr[i][j] +" ");

				System.out.println();
			}
		}
	}
