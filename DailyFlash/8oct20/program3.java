
  import java.util.*;
  class JaggedArray3 {

	  public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter number of rows for jagged array: ");
		  int row = sc.nextInt(),sum=0;
		  
		  int[][] arr = new int[row][];
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  System.out.print("Enter number of columns in row "+(i+1) +": ");
			  arr[i] = new int[sc.nextInt()];
		  }

		  for(int i=0;i<arr.length;i++) {
			  System.out.println("Enter elements in row " +(i+1) +": ");
			  
			  for(int j=0;j<arr[i].length;j++) {
				  arr[i][j] = sc.nextInt();
			  	  sum=sum+arr[i][j];
			  }
		  }

		  System.out.println("-----Array------");
		  for(int i=0;i<arr.length;i++) {

			  for(int j=0;j<arr[i].length;j++) 
				  System.out.print(arr[i][j]+" ");
			  System.out.println();
		  }
		  System.out.println("-----------------");
		  System.out.println("Sum:"+sum);
	  }
  }
