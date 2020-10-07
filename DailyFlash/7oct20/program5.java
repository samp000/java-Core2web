  
  import java.util.*;
  class JaggedArray5 {

	  public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

		  int[][] stud = new int[3][];
		  int[] avg = new int[3];

		  System.out.println("Enter no of tests given by");
		  for(int i=0;i<stud.length;i++) {
			  System.out.print("Student "+(i+1) +": ");
			  stud[i] = new int[sc.nextInt()];
		  }

		  System.out.println("Enter of marks for tests");
		  for(int i=0;i<stud.length;i++) {
			  avg[i] = 0;
			  System.out.println("-----Student "+(i+1)+"----- ");
			  for(int j=0;j<stud[i].length;j++) {
				  stud[i][j] =sc.nextInt();
				  avg[i] = avg[i]+stud[i][j];
			  }
		  }
		  System.out.println("----Array-----");
		  for(int i=0;i<stud.length;i++) {

			  for(int j=0;j<stud[i].length;j++) {
				 // avg[i]=avg[i]/stud[i].length;
				  System.out.print(stud[i][j] +" ");
			  }
			  System.out.println();
		  }

		  System.out.println("-----------------");
		  for(int i=0;i<stud.length;i++) 
			  System.out.println("Avarage of student "+(i+1) +" is: "+avg[i]/stud[i].length);
	  }
  }
