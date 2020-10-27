
	import java.util.*;

	class StringCompare {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter string1:");
			String str1 = sc.nextLine();	

			System.out.print("Enter string2:");
			String str2 = sc.nextLine();	

			if(str1.equals(str2)==true)
				System.out.println("both string are equal");
			else
				System.out.println("both string are not  equal");

		}
	}
