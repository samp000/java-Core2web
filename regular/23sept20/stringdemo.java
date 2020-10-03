
	import java.util.*;
	import java.io.*;

	class stringToDemo {

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String mainVar = br.readLine();

			StringTokenizer stz = new StringTokenizer(mainVar , ",",true);

			System.out.println(stz.nextToken());
			System.out.println(stz.nextToken());
			System.out.println(stz.nextToken());



		}
	}
