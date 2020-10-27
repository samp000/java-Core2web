 import java.util.*;

        class StringBufferAppend {

                public static void main(String args[]) {

                        Scanner sc = new Scanner(System.in);

                        System.out.print("Enter String1:");
                        StringBuffer str1 = new StringBuffer(sc.nextLine());
        
			System.out.print("Enter String to append:");
			String str2 = sc.nextLine();

			System.out.println("Before append: "+str1);
			
			str1.append(str2);

			System.out.println("After append: "+str1);
                        
		}
	}


