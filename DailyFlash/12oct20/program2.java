	import java.io.*;

	class StringDemo2 {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

			System.out.print("Enter string: ");
			String str1 = br.readLine();
			System.out.print("Enter String: ");
			String str2 = new String(br.readLine());

			System.out.println(str1 +"\"" +str2);
		}
	}
