	import java.util.*;
	class AppendReverse {

		public static void main(String[] args) {

			Scanner sc =  new Scanner(System.in);

			System.out.print("Enter String1:");
			StringBuilder s1 = new StringBuilder(sc.nextLine());

			System.out.print("Enter String2:");
			StringBuilder s2 = new StringBuilder(sc.nextLine());

			s2.reverse();
		        StringBuilder s3 = new StringBuilder("");

			int cnt = s1.length()+s2.length();
		
			for(int i=0;i<s1.length() || i<s2.length();i++) {

				if(i<s1.length())
					s3.append(s1.charAt(i));
				if(i<s2.length())
					s3.append(s2.charAt(i));
			}

			System.out.println("Result: "+s3);
		}
	}
