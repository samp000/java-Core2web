	import java.util.*;
	class Jagged3DArray {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of planes and rows respectively: ");
			int pln = sc.nextInt();
			int row = sc.nextInt();
			double[][][] arr = new double[pln][row][];
			for(int i=0;i<pln;i++) {
				for(int j=0;j<row;j++) {
					System.out.print("Enter no of cols in plane" +(i+1) +" & row "+(j+1)+": ");
					arr[i][j] = new double[sc.nextInt()];
				}
			}
			for(int i=0;i<pln;i++) {
				System.out.println("-----------For plane" +(i+1) +"----------");

				for(int j=0;j<arr[i].length;j++) {

					System.out.println("Enter elements in row "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) 
						arr[i][j][k]=sc.nextDouble();
				}
			}
			for(int i=0;i<2;i++) {
				System.out.println("---------------Plane " +(i+1)+"--------------");
				for(int j=0;j<arr[i].length;j++) {

					for(int k=0;k<arr[i][j].length;k++) 
						System.out.print(arr[i][j][k] +" ");
					System.out.println();
				}
			}
		}
	}
