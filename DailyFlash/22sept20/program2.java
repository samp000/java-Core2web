

	import java.io.*;

	class LoopDrive {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int sum =0;
			int no;
			for(no=0;;) {	
				 no = Integer.parseInt(br.readLine());
				 if(no>=50)
					 break;
				 else
					 sum=sum+no;

			}	
			System.out.println("sum= "+sum);
		}
	}
