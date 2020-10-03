
	import java.io.*; 

	class SumArray {

		public static void main(String args[]) throws IOException {

			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the size of an Array: ");
			int sz =Integer.parseInt(br.readLine()) ,sum=0;

			int[] arr = new int[sz];
			System.out.println("Enter array elements: ");

			for(int i=0;i<sz;i++) {
				arr[i] = Integer.parseInt(br.readLine());
				sum=sum+arr[i];
			}
			System.out.println("Sum of array elements is: "+sum);
		}
	}
