
	 import java.util.*;

         class Toggle {

                public static void main(String args[]) {

                        Scanner sc = new Scanner(System.in);

                        System.out.print("Enter String:");
                        String str = sc.nextLine();

			char carr[] = str.toCharArray();

			for(int i=0;i<carr.length;i++) {

                                if(carr[i]>='A' && carr[i]<='Z')
                                        carr[i] = (char)((int)carr[i]+32);

                                else if(carr[i]>='a'&& carr[i]<='z')
                                  	carr[i] = (char)((int)carr[i]-32);
                        }
				System.out.print("Toggled string: ");
				System.out.print(carr);
				System.out.println();
		}
	 }		

