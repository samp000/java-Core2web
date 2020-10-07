
  class JaggedArray2 {

	  public static void main(String[] args) {

		  int[][] arr = new int[3][];

		  arr[0] = new int[4];
		  arr[1] = new int[2];
		  arr[2] = new int[4];

		  for(int i=0,idx=1;i<arr.length;i++) {

			  for(int j=0;j<arr[i].length;j++) {

				  arr[i][j]=idx*idx;
				  System.out.print(arr[i][j] +" ");
				  idx++;
			  }
			  System.out.println();
		  }
	  }
  }
