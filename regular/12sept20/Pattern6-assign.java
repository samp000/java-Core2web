
	/*
	 *	      1
	 *	    A A A 
	 *	  2 2 2 2 2
	 *	B B B B B B B
	 */

		class Pattern6 {

			public static void main(String args[]) {

				int no =1;
				char ch='A';

				for(int row=1;row<=5;row++) {

					for(int space =4; space>=row;space--)
						System.out.print("  ");

					for(int col=1;col<=row*2-1;col++){

						if(row%2==0)
							System.out.print(ch +" ");
						else
							System.out.print(no +" ");
					}
					System.out.println();
					if(row%2==0)
						ch++;
					no++;

				}
			}
		}
