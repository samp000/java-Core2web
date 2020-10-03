	import java.io.*;
	import java.util.*;

	class Token1 {

		public static void main(String args[]) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String Token = br.readLine();

			StringTokenizer stz = new StringTokenizer(Token , " ");

			String StudentName = stz.nextToken();
			char Grade = stz.nextToken().charAt(0);
			int Age =  Integer.parseInt(stz.nextToken());
			double Marks = Double.parseDouble(stz.nextToken());

			System.out.println("name: "+StudentName);
			System.out.println("grade: "+Grade);
			System.out.println("age: "+Age);
			System.out.println("Marks: "+Marks);
		}
	}
