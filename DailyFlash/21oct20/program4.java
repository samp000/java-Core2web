
	import java.util.*;

	class Palindrome {

		public static void main(String[] arsg) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter string:");
			String str1 = sc.nextLine() , str2="";

			for(int i=str1.length()-1;i>=0;i--)
			       str2 = str2+str1.charAt(i);

			if(str1.equalsIgnoreCase(str2))
				System.out.println(str1+" is palindrome ");
			else
				System.out.println(str1+" is not palindrome");
		
		}
	}
