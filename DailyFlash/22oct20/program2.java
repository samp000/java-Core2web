	
	import java.util.*;

	class SubString {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter String1:");
			String str1 = sc.nextLine();	
			System.out.print("Enter String2:");
			String str2 = sc.nextLine();

			if(str1.indexOf(str2) == 0)
				System.out.println("\nYes");
			else	
				System.out.println("\nNo");

		}
	}
