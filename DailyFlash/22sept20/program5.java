
	class Pattern2 {
		
		public static void main(String args[]) {
			
			int no=1;
			for(int row=1;row<=4;row++) {
				
				for(int space=3;space>=row;space--)
					System.out.print("  ");
				
				for(int col=1;col<=row*2-1;col++) {

						System.out.print(no+" ");
				}
				no++;
				System.out.println();
			}
		}
	}
