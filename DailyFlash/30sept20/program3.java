
	import java.io.*;

	class Marks {

		public static void main(String args[]) throws IOException {

			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			float[] mar = new float[5] ;
			float total = 0;

			System.out.println("Enter marks of 5 subjects : ");

			for(int i=0;i<5;i++) {
				mar[i]=Integer.parseInt(br.readLine());
				total = total+mar[i];
			}

			System.out.println("Total Marks are : "+total);
			System.out.println("Percentage is : "+(float)(total/5) +" %");
		}
	}
