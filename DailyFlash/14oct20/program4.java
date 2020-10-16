
	class ArrayDemo4 {

		public static void main(String args[]) {

			String[] sarr = {"I","am","Indian"};

			for(int i=0;i<sarr.length;i++) {
				for(int j=0;j<=i;j++) 
					System.out.print(sarr[i]+" ");
				System.out.println();
			}
		}
	}
