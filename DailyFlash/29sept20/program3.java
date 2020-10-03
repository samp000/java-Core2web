
   import java.io.*;

        class Avg {

                public static void main(String args[]) throws IOException {

                        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

			float[] arr = {12.5f,40.5f,20.5f,36.5f,80.5f};
			float sum = 0;

			for(int i=0 ;i<arr.length ;i++ ) 
				sum = sum+arr[i];

			System.out.println("Avarage : " +sum/arr.length);

		}
	}

