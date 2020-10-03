
	import java.util.*;

	class Numbers {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter 10 numbers : ");
 
			int[] arr = new int[10];
			int pos=0,neg=0,odd=0,even=0,zero=0;

			for(int i =0 ;i<10 ;i++) {

				arr[i] = sc.nextInt();

				if(arr[i]>0)
					pos++;	
				if(arr[i]<0)
					neg++;
				if(arr[i]==0)
					zero++;
				if(arr[i]%2!=0)
					odd++;
				if(arr[i]%2==0)
					even++;
			}
			
			System.out.println("Positive Numbers :"+pos);
			System.out.println("Negetive Numbers :"+neg);
			System.out.println("Zeros :"+zero);
			System.out.println("Odd numbers :"+odd);
			System.out.println("Even  Numbers :"+even);
		}
	}
