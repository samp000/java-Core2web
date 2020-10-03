
	import java.util.*;
	import java.io.*;

	class Token2{

		public static void main(String args[]) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();

			StringTokenizer stz =new StringTokenizer(str,",");

			String StudentName = stz.nextToken().trim();
			char Grade = stz.nextToken().trim().charAt(0);
			int Age = Integer.parseInt(stz.nextToken().trim());
			double Marks = Double.parseDouble(stz.nextToken().trim());

			System.out.println("Name: "+StudentName);
			System.out.println("Grade: "+Grade);
			System.out.println("Age: "+Age);
			System.out.println("Marks: "+Marks);
		}
	}
