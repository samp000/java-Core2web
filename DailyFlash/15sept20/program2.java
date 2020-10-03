
	class Pattern2 {

		public static void main(String args[]) {

			for(int row=1;row<=5;row++) {

				for(int space=4;space>=row;space--)
					System.out.print("  ");

				for(int col=1;col<=row;col++) {

					if(col%2!=0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				System.out.println();
			}
		}
	}
