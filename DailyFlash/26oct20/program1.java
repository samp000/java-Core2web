
	import java.util.*;
	class Characters5 {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter String:");
			StringBuffer str = new StringBuffer(sc.nextLine());

			int ln; 

			if(str.length()>=5)
				 ln = 5;
			else 
				 ln = str.length();

			for(int i=0;i<ln;i++) {
				System.out.print(str.charAt(i) +" ");
			}	
			System.out.println();
		}
	}
