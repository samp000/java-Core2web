	
	import java.io.*;

	class LeapYear {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int year = Integer.parseInt(br.readLine());

			if(year%4==0)
				System.out.println(year +" is a leap year");
			else
				System.out.println(year +" is not a leap year");
		}
	}
