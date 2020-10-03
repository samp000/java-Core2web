
	/*
	 *	1 * 2 *
	 *	3 * 4
	 *	5 * 
	 *	6
	 */

		class Pattern3 {

			public static void main (String args[]) {

				int num = 1;
				for(int i =1 ;i<=4 ;i++) {

					for(int j=4 ;j>=i;j--) {

						if(j%2==0) {
							System.out.print(num +" ");
							num++;
						}
						else {

							System.out.print("* ");
						}
					}
					System.out.println();

				}
			}
		}
