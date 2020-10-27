
	import java.util.*;

	class StringReplace {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter String: ");
			
			StringBuilder str = new StringBuilder(sc.nextLine());

			System.out.print("Enter charcter want to find: ");
			char chf = sc.nextLine().charAt(0); 

			System.out.print("Enter charcter want to replace: ");
			char chr = sc.nextLine().charAt(0); 

			System.out.println("--------------\nBefore String:" +str);
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==chf)
					str.setCharAt(i,chr);
			}
			
			System.out.println("After String:" +str);
		}
	}
