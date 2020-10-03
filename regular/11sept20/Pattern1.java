	/*
	 *	= = = = 
	 *	= * * =
	 *	= * * =
	 *	= = = = 
	 */
	
	class Pattern1 {

		public static void main(String arghs[]) {

			for(int i =1;i<=4 ;i++) {
			
				for(int j =1; j<=4;j++) {

					if((j==2 || j==3) && (i==2 || i==3))
						System.out.print("* ");
					else
						System.out.print("= ");

				}
				System.out.println();
			}

		}
	}
