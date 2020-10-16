	import java.util.*;
	class ArrayDemo5 {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of an array:");
			int sz = sc.nextInt();
			int[] arr = new int[sz];
			System.out.println("Enter array elements:");	
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}

			if(mono(arr)==true)
				System.out.println("Array is monotonic");
			else
				System.out.println("Array is not monotonic");
		}
		static boolean mono(int arr[]) {
			boolean incr=false,decr=false ;
			if(arr[0]<arr[0+1]) {
				
				for(int i=0;i<arr.length-1;i++) {
					if(arr[i]<arr[i+1])
						incr=true;
					else {
						incr=false;
						break;
					}
				}
			}
			else if(arr[0]>arr[0+1]) {
                                for(int i=0;i<arr.length-1;i++) {
                                        if(arr[i]>arr[i+1])
                                                decr=true;
					else {
                                                decr=false;
                                                break;
                                      }
				}
                        }
			return incr || decr ;
		}
	}
