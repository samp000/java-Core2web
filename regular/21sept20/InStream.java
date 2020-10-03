
	import java.io.*;

	class Demo {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int a = Integer.parseInt(br.readLine());	
			int b = Integer.parseInt(br.readLine());	
			System.out.println("a+b: "+a+b);
			System.out.println("a-b: "+(a-b));
			System.out.println("a*b: "+a*b);
			System.out.println("a/b: "+a/b);
		}
	}
