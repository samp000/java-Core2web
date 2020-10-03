
	import java.util.*;

	class Pattern {

		public static void main(String args[]) {

			Scanner sc =new Scanner(System.in);

			System.out.print("No of rows:");
			int n = sc.nextInt();

			for(int row=1 ; row<=n;row++) {

				for(int col=1;col<=5;col++) {

					if(row%2!=0) {

						if(col%2!=0)
							System.out.print("0");
						else
							System.out.print("1");
					}

					else  {

						if(col%2==0)
							System.out.print("0");
						else
							System.out.print("1");
					}

				}
				System.out.println();
			}
		}
	}
