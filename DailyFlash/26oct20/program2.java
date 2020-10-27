
	import java.io.*;
	import java.util.*;
	class ChangeCase {

		public static void main(String args[]) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter String:");
			String str = br.readLine();
	
			char arr[] = str.toCharArray();
			System.out.print("Enter index:");
			int indx = Integer.parseInt(br.readLine());

			if(indx>arr.length && indx<arr.length) {
				
				System.out.println("Invalid index!....");
				System.exit(0);
			}
			System.out.println(arr);

			if(arr[indx-1]>'A' && arr[indx-1]<'Z')
				arr[indx-1] = (char)((int)arr[indx-1]+32);

			else if(arr[indx-1]>'a' &&  arr[indx+1]<'z')
				arr[indx-1] = (char)((int)arr[indx-1]-32);

			System.out.println(arr);
		}
	}
