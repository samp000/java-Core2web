
	class Pattern3 {

		public static void main(String args[]) {

			int no=5;
			for(int row=1;row<=5;row++) {

				for(int col=1;col<=row;col++) {

					System.out.print(no*no +" ");
					no++;
				}
				no=no-(row+1);
				System.out.println();
			}
		}
	}
