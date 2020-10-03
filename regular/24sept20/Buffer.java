
	import java.io.*;
	import java.util.*;

	class Tokean {
		

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String str = br.readLine();

			StringTokenizer stz =new StringTokenizer(str , " ");

			String name = br.readLine(stz.nextToken());
		}
	}
