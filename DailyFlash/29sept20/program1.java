
	import java.io.*;

	class Cricket {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

			int n_of_plyr = Integer.parseInt(br.readLine());

			int[] plyr = new int[n_of_plyr];

			for(int i = 0 ; i<n_of_plyr ; i++)
			plyr[i] = Integer.parseInt(br.readLine());	
				
			int sum = 0;

			for(int i =0 ;i<n_of_plyr;i++) {

				sum = sum+plyr[i];
			}
			System.out.println("Sum of runs: " +sum);
		}
	}
