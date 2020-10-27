
	import java.util.*;
	class SumArray {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter size of array: ");

			int sz = sc.nextInt(),sum=0;
			int[] arr = new int[sz];

			System.out.println("Enter array elements:");
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("array elements:");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				sum=sum+arr[i];
			}
			
			System.out.println("\nSum:"+sum);

		}
	}
