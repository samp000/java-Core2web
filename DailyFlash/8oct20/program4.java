
  import java.util.*;
  class JaggedArray4 {

	  public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter number of rows for jagged array: ");
		  int row = sc.nextInt();
		  int[][] arr = new int[row][];
		  for(int i=0;i<arr.length;i++) {
			  
			  System.out.print("Enter number of columns in row "+(i+1) +": ");
			  arr[i] = new int[sc.nextInt()];
		  }
		  for(int i=0;i<arr.length;i++) {
			  System.out.println("Enter elements in row " +(i+1) +": ");
			  
			  for(int j=0;j<arr[i].length;j++) 
				  arr[i][j] = sc.nextInt();
		  }
		  System.out.println("-----Array------");
		  for(int i=0;i<arr.length;i++) {

			  for(int j=0;j<arr[i].length;j++) 
				  System.out.print(arr[i][j]+" ");
			  	  System.out.println();
		  }
		  System.out.println("-----------------");
		  System.out.print("Even numbers:");
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[i].length;j++) {

				  if(arr[i][j]%2==0)
					  System.out.print(arr[i][j] +" ");
			  }
		  }
		  System.out.println();
	  }
  }
