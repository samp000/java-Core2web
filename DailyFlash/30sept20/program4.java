
	import java.util.*;

	class Student_Age {

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter no of students : ");
			int std_no = sc.nextInt();
			int mx_age = 0, mx_indx=0 ;
			int[] arr = new int[std_no];

			for(int i = 0 ; i<std_no ;i++) {

				arr[i] = sc.nextInt();

				if(arr[i]>=mx_age) {

					mx_age=arr[i];
					mx_indx=i;
				}
			}
			System.out.println("Maximum age = " +mx_age +"\n Max Index : "+mx_indx);
		}
	}
