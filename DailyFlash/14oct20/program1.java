
	class ArrayDemo1 {

	    public static void main(String [] main){

		    int[][] arr = { {1,2,3},{4,5,6},{7,8,9},{1,2,3}};
		    int row=0,col=0;

		    System.out.println("---Array---");
		    for(int i=0;i<arr.length;i++) {
			    row++;
			    col=0;
			    for(int j=0;j<arr[i].length;j++) {
				    col++;
				    System.out.print(arr[i][j]+" ");
			    }
			    System.out.println();
		    }

		    System.out.println("\nThis array is of dimension:"+row+"x"+col);
	    }
	}
