
	import java.util.*;

	class Cricket {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the number of overs: ");
			int ovrs = sc.nextInt(),trun=0,six=0,fr=0,otrs=0,dbll=0;
			int[] arr = new int[ovrs*6];

			for(int i=0;i<ovrs*6;i++) {

				System.out.print("Enter runs on ball no" +(i+1) +": ");
				arr[i] = sc.nextInt();
				
				trun=trun+arr[i];

				if(arr[i]==6)
					six++;
				else if(arr[i]==4)
					fr++;
				else if(arr[i]==0)
					dbll++;
				else
					otrs++;
			}

			System.out.println("\n---------------------Score Card--------------------");
			System.out.println("Total score: "+trun);
			System.out.println("Number of balls: "+(ovrs*6));
			System.out.println("Numer of sixes: "+six);
			System.out.println("Number of fours: "+fr);
			System.out.println("Number of others(1,2,3 runs): "+otrs);
			System.out.println("Number of dot balls: "+dbll);
			System.out.println("---------------------------------------------------");


		}
	}
