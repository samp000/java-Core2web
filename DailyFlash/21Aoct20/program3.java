
	import java.util.*;

	class StringLength5 {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter string:");
			String str = sc.nextLine();
			
			if(str.length() >= 5)
				System.out.println(str);
			else
			System.out.println("Length of string is than 5");
		}
	}
