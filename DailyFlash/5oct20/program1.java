
	import java.util.*;

	class ArrMulti {

		public static void main(String args[]) {
	
			Scanner sc = new Scanner(System.in);	
			System.out.print("length of array: ");
			int N = sc.nextInt();

			int[] arr1 = new int[N];
			int[] arr2 = new int[N];
			int[] mularr = new int[N];

			System.out.println("Enter elements in first array: ");

			for(int i=0;i<N;i++)
				arr1[i]=sc.nextInt();

			System.out.println("Enter elements in second array: ");

			for(int i=0;i<N;i++) {
				arr2[i]=sc.nextInt();
				mularr[i] = arr1[i]*arr2[i];
			}

			System.out.println("After operation elements in third array: ");
			for(int i=0;i<N;i++) {

				System.out.print(mularr[i] +" ");
			}
			System.out.println();


		}
	}
