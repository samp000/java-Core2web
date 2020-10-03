
	import java.util.*;
	class RevArray {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the size of array: ");
			int sz = sc.nextInt();
			int[] arr = new int[sz];

			System.out.println("Enter array elements: ");
			for(int i=0;i<sz;i++) 
				arr[i]=sc.nextInt();

			System.out.println("Array is reverse order is:  ");
			for(int i=sz-1;i>=0;i--) 
				System.out.print(arr[i] +" ");
			
			System.out.println();


		}
	}
