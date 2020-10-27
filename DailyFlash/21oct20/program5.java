
        import java.util.*;
        class Password {

                public static void main(String args[]) {

                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter password:");

                        String str = sc.nextLine();
                        boolean flag = false;
                        int f=0;

                        if(str.length()>=8)
                                f=1;
			else
				flag = false;
                        if(f==1) {
                                for(int i=0;i<=9;i++) {
                                        String s = Integer.toString(i) ;

                                        if(str.indexOf(s)!=-1) {
                                                flag = true;
                                                break;
					}
                                }
                        }
                        if((str.contains("@"))||(str.contains("%"))||(str.contains("$"))||(str.contains("#")))
                                flag = true;
                        else
                                flag = false;

			if(flag==true)
				System.out.println("This is valid password");
			else
				System.out.println("This is invalid password");
                }
        }

