
	class Pattern1 {

		public static void main(String args[]) {

			int no=1;
			for(int row=1;row<=4;row++) {

				for(int space=3;space>=row;space--)
					System.out.print("  ");
				for(int col=1;col<=row*2-1;col++) {

					if(col==1 || col==row*2-1)
						System.out.print(no+" ");
					else
						System.out.print("  ");
				}
				no++;
				System.out.println();
			}
		}
	}
