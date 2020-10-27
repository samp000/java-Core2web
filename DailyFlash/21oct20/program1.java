
	import java.util.*;
	
	class Vowels {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter String:");
			String str = sc.nextLine();
			int count=0;
			for(int i=0;i<str.length();i++) {

				int p = str.charAt(i);
				if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U') {
					count++;
				}
			}

			System.out.println("Vowels in string "+str +" are: "+count);
		}
	}
