
	import java.util.*;

	class Occurence {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter String: ");
			String str = sc.nextLine();

			System.out.print("Enter character: ");
			char ch = sc.next().charAt(0);

			System.out.println("First Occurence: "+str.indexOf(ch));
			System.out.println("Last Occurence: "+str.lastIndexOf(ch));

		}
	}
