
	import java.io.*;

	class Stud {

		public static void main(String args[]) throws  IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Name: ");
			String name = br.readLine();
			System.out.print("Roll No : ");
			int rollno = Integer.parseInt(br.readLine());
			System.out.print("Field of Interest: ");
			String Fintrst = br.readLine();

			System.out.println("Hey,my name is "+name +" and my roll number is "+rollno +". My field of interest is "+Fintrst);
		}
	}
