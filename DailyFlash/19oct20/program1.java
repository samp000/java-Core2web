
	import java.util.*;
	class FindNReplace {
		
		public static void main(String args[]) {


			Scanner sc = new Scanner(System.in);
			String[] arr = {"Bobby","Lilly","Arjun","Priti"};

			System.out.println("Before:");
			for(int i=0;i<arr.length;i++) 
				System.out.print(arr[i] +" ");
		
			for(int i=0;i<arr.length;i++)  {

				if(arr[i] == "Lilly") {
					arr[i] = "Rosh";
				}

			}

			System.out.println("\n After:");
			for(int i=0;i<arr.length;i++) 
				System.out.print(arr[i] +" ");

			System.out.println();
	
		}

	}
