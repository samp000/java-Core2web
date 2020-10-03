	
	/*
	 *       A
	 *     A B
	 *   A B C
	 * A B C D
	 *
	 */

		
	class Pattern3 {

		public static void main(String args[]) {

			for(int row =1 ;row<=4;row++) {

				char ch ='A';

				for(int space=3;space>=row;space--) 
					System.out.print("  ");
		
				for(int col=1;col<=row;col++) {

					System.out.print(ch +" ");
					ch++;
				}
				System.out.println();
			}
		}
	}
