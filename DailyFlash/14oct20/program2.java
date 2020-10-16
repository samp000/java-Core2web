	import java.util.*;
	class ArrayDemo2 {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of an array:");
			int sz = sc.nextInt();
			int[] arr = new int[sz];
			System.out.println("Enter array elements:");	
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(oddocc(arr)+" is occured in odd number of times");
		}

		static int oddocc(int arr[]) {
			int count;
			for(int i=0;i<arr.length;i++) {
				count=0;
				for(int j=0;j<arr.length;j++) {
				
					if(arr[i]==arr[j])
						count++;
				}
				if(count%2!=0)
					return count;
			}
			return 0;
		}
	}
