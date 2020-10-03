
	import java.io.*;

	class LargestNum {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());

			if(a>b && a>c)
				System.out.println(a +" is largest among " +a +" " +b +" and " +c );
			else if(b>c)
				System.out.println(b +" is largest among " +a +" " +b +" and " +c );
			else
				System.out.println(c +" is largest among " +a +" " +b +" and " +c );

		}
	}
