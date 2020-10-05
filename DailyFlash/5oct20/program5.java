
	import java.util.*;
	class RevArray {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);
                        System.out.print("Enter length of array: ");
                        int N = sc.nextInt();

                        int[] arr = new int[N];

                        System.out.println("Enter elements in array: ");

                        for(int i=0;i<N;i++)
                                arr[i]=sc.nextInt();

                        System.out.println("Reversed array: ");
                          for(int i=N-1;i>=0;i--)
				  System.out.printf("%02d ",arr[i]);
			System.out.println();
		}
	}
