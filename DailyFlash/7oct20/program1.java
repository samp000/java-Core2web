
  import java.util.*;
  class JaggedArray1 {

	  public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

		  int[][] arr = new int[3][] ;

		  for(int i=0;i<arr.length;i++) {

			  System.out.print("Enter number of columns for row " +(i+1 +": "));
			   arr[i] = new int[sc.nextInt()];
		  }

		  System.out.println("Enter elements: ");

		  for(int i=0;i<arr.length;i++) {

			  for(int j=0;j<arr[i].length;j++) 
				  arr[i][j] = sc.nextInt();
		  }

		  for(int i=0;i<arr.length;i++) {

			  for(int j=0;j<arr[i].length;j++) 
				  System.out.print(arr[i][j] +" ");
			  System.out.println();
		  }
	  }
  }
