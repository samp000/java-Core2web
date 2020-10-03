
	

	class Pattern4 {

		public static void main(String args[]) {

			int no=1;
			int indx=1;
			for(int row=1;row<=5;row++) {

				for(int col=5;col>=row;col--) {

					if(row==4)
						no=16;
					else if (row==5)
						no=25;
					else {
					System.out.print(no+" ");
					no=no+row;
					}
				}
				no=no-(row+1);
				System.out.println();
			}
		}
	}
