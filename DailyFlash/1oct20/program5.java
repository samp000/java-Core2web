
	import java.util.*;
	
	class CmpTwoArr {	 

		public static void main(String args[]) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of an array ");
			
			int sz = sc.nextInt();
			int[] arr1 = new int[sz];
		        int[] arr2 = new int[sz];
			Arrays.fill(arr2,0);

			for(int i=0;i<sz;i++) {
				System.out.print("Enter element: ");
				arr1[i]=sc.nextInt();
			}

			for(int i=0;i<sz;i++) {
				if(arr1[i]%2==0)
					arr2[i]=-1;

				System.out.println("ArrayOne[" +(i+1) +"] = " +arr1[i] +" && Arrayone[" +(i+1) +"] = " +arr2[i]);
			}
		}	
       	}
