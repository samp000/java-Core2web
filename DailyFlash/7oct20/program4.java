 
  import java.util.*;
  class JaggedArray4 {
	  
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int[][] pepl = new int[4][];
		  int[] sum = new int[4];				//array to store no of books per person
		  
		  for(int i=0;i<pepl.length;i++) {
			  System.out.print("Enter no of weekdays of person " +(i+1) +" to read books: ");
			  pepl[i] = new int[sc.nextInt()];
		  }

		  System.out.println("enter number of books: ");				//loop fore accept no of books for perticuler person
		  for(int i=0;i<pepl.length;i++) {

			  sum[i]=0;
			  System.out.println("----Person "+(i+1)+"----");
			  for(int j=0;j<pepl[i].length;j++) {
				  pepl[i][j]=sc.nextInt();
				  sum[i]=sum[i]+pepl[i][j];
			  }
		  }

		  System.out.println("---Jagged Array is---");
		  for(int i=0;i<pepl.length;i++) {						//displaying jagged array
			  for(int j=0;j<pepl[i].length;j++)
				  System.out.print(pepl[i][j] +" ");
			  System.out.println();
		  }
		  System.out.println("-----------");

		 for(int i=0;i<pepl.length;i++) {

			 System.out.println("No of books read by person" +(i+1)+" is:"+sum[i]);
		 } 
	  } 
  }
