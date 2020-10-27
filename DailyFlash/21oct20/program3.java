import java.util.*;
class SubStringDemo {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in) ;

		System.out.print("Enter String:");
		String str1 = sc.nextLine();

		System.out.print("Enter Substring:");
		String str2 = sc.nextLine();
		
		if(str1.indexOf(str2) != -1)
			System.out.println("String "+str2 +" is substring of string "+str1);
		else
			System.out.println("String "+str2 +" is not substring of string "+str1);
	}
}
