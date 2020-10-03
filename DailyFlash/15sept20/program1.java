
	/*
	 *
	 */

	
	class Pattern1 {

		public static void main(String args[]) {

			int ch =65;
			for(int row =1;row<=5;row++) {
		
				for(int space=4;space>=row;space--)
					System.out.print("  ");

				for(int col=1;col<=row;col++) {

					System.out.print((char)ch++ +" ");
				}
				ch=ch-(row-1);
				System.out.println();
			}
		}
	}
