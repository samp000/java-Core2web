
	 class JaggedArray1 {

		 public static void main(String args[]) {

			 int[][] arr = {{10,30,50,80},{40,60,80},{11,33,22,423,43}};
			 
			 for(int i=0;i<arr.length;i++) {

				 for(int j=0;j<arr[i].length;j++) 
					 System.out.print(arr[i][j]+" ");

				 System.out.println();
			 }
		 }
	 }
