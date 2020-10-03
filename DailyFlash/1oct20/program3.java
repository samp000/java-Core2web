
	import java.util.*;

	class Greatest {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the size of an Array: ");
			int sz = sc.nextInt() , grt = 0;
			
			System.out.println("Enter array elements: ");
			int[] arr = new int[sz];

			for(int i=0;i<sz;i++){ 

				arr[i]=sc.nextInt();

				if(arr[i]>=grt)
					grt = arr[i];
			}

			System.out.println("Greatest umber in array is: "+grt);


		}
	}
