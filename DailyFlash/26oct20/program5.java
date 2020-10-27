
	import java.util.*;
	class LastOccurance {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in); 
			
			System.out.print("Enter string: ");
			String str = sc.nextLine();

			System.out.print("Enter SubString: ");
			String sbstr = sc.nextLine();

			System.out.println(str.lastIndexOf(sbstr));

		}
	}
