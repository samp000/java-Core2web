
	import java.util.*;

	class Arrindxadd {

		public static void main(String args[]) {
	
			Scanner sc = new Scanner(System.in);	
			System.out.print("Enter length of array: ");
			int N = sc.nextInt();

			int[] arr = new int[N];

			System.out.println("Enter elements in first array: ");

			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
  
			System.out.println("Original array: ");
			for(int i=0;i<N;i++)
				System.out.print(arr[i]+" ");

			System.out.println("\n Enter index at which you want to add element: ");
			int indx = sc.nextInt();

			System.out.println("Enter number want to add: ");
			int numb = sc.nextInt();

			int[] rarr = new int[N+1];

			for(int i=0;i<N+1;i++) {

				if(i<indx-1) 
					rarr[i] = arr[i]; 
				else if(i==indx-1)
					rarr[i]=numb;
				else
					rarr[i]=arr[i-1];
			}

			System.out.println("New Array: ");

			for(int i=0;i<N+1;i++)
				System.out.print(rarr[i]+" ");
			System.out.println();
		}
	}
