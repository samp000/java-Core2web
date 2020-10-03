
	class Pattern {

		public static void main(String args[]) {


			char[] arr = {'A','B','C','D','E'};

			for(int row =1 ; row<=5 ;row++) {

				int indx = row-1 ;

				for(int col = 5 ;col>=row;col--) {
					System.out.print(arr[indx] +" ");
					indx++;
				}
				System.out.println();
			}
		}
	}
