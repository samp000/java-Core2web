
	/*
	 * 	1 A 3 B
	 * 	5 C 7
	 * 	8 D
	 * 	10
	 */

	class Pattern4 {

		public static void main(String args[]) {

			int num = 1;
			char ch = 'A';

			for(int i=1 ;i<=4 ;i++) {

				for(int j=4 ;j>=i;j--) {

					if(j%2==0)
						System.out.print(num +" ");
					else {
						System.out.print(ch +" ");
						ch++;
					}
					num++;
				}
				System.out.println();
			}
		}
	}
