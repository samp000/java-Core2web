
	class StringBufferDemo {

		public static void main(String args[]) {

			String s1 = "Sandesh";

			String s2 = "Sandesh";

			StringBuffer sb1 = new StringBuffer("Sandesh");
			StringBuffer sb2 = new StringBuffer("Sandesh");

			System.out.println(s1==s2);
			System.out.println(sb1==sb1.append("Marathe"));
		}
	}
