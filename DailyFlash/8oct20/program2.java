
	class JaggedArray2 {

		public static void main(String args[]) {

			int[][] arr1 = {{10},{20,30},{40,50,60}};

			System.out.println("-----Array by method 1-----");
			for(int i=0;i<arr1.length;i++) {
			
				for(int j=0;j<arr1[i].length;j++)
					System.out.print(arr1[i][j] +" ");
				System.out.println();
			}

			int[][] arr2 = new int[3][];

			arr2[0] = new int[] {10};
			arr2[1] = new int[] {20,30};
			arr2[2] = new int[] {40,50,60};

			System.out.println("-----Array by method 2-----");
			for(int i=0;i<arr1.length;i++) {	
			
				for(int j=0;j<arr1[i].length;j++)
					System.out.print(arr1[i][j] +" ");
				System.out.println();
			}

			int[][] arr3 = {
				new int[] {10},
				new int[] {20,30},
				new int[] {40,50,60}
			};

			System.out.println("-----Array by method 3-----");
			for(int i=0;i<arr1.length;i++) {	
			
				for(int j=0;j<arr3[i].length;j++)
					System.out.print(arr3[i][j] +" ");
				System.out.println();
			}

		}
	}
