
	class Find_Num {

		public static void main(String args[]) {

			int[] my_array1 = { 1789,2035,1899,2013,1458,2458,1254,1472,2365};

			boolean f =false , s = false;

			for(int i=0;i<my_array1.length;i++) {

				if(my_array1[i]==2013)
					f = true;
				if(my_array1[i]==2015)
					s =true;
			}

			if(f==true)
				System.out.println("2013 is present in an array");
			else
				System.out.println("2013 is not present in an array");
			if(s==true)
				System.out.println("2015 is present in an array");
		
			else
				System.out.println("2015 is not present in an array");




		}
	}
