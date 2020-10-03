
	import java.io.*;

	class InputDemo  {
	
		public static void main(String args[]) throws IOException{

			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter number 1:");
			String no1 = br.readLine();
			System.out.println(no1);

			System.out.println("Enter number 2:");
			String no2 = br.readLine();
			System.out.println(no2);

			System.out.println("Add :" +(no1+no2));

		}
	}
