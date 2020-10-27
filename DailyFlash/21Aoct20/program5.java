
	class RefferenceObj {

		public static void main(String args[])  {

			String str1 = new String ("Sandesh");
			String str2 = "Sandesh";
			String str3 = new String("Sandesh");
			String str4 = "Sandesh";

			System.out.println("heap obj and scp:" +(str1==str2));	//false
			System.out.println("heap obj and heap:" +(str1==str3));	//false
			System.out.println("scp obj and scp obj:" +(str2==str4));	//true


		}
	}
