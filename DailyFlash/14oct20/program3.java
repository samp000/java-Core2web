	import java.util.*;
	class ArrayDemo3 {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of an array:");
			int sz = sc.nextInt();
			int[] arr = new int[sz];
			System.out.println("Enter array elements:");	
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			
		       System.out.println("Array is: ");	
		       	for(int i=0;i<arr.length;i++) {
                                System.out.print(arr[i]+" ");
                        }
			System.out.println("\n Element "+find(arr)+" is missing");
		}

		static int find(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i+1]-arr[i]>1) {
					return(arr[i+1]-1);
				}
			}
			return 0;
		}
	}
