	import java.util.*;
	class StringBufferDemo {

		public static void main(String args[]) {

			String s1 = "Sandesh";

			String s2 = "Sandesh,Marathe,12";

//			StringBuffer sb1 = new StringBuffer("Sandesh");
//			StringBuffer sb2 = new StringBuffer("Sandesh");

			StringTokenizer stz = new StringTokenizer(s2,",");
			System.out.println(stz.nextToken());
			s1 = stz.nextToken();
			System.out.println(s1);
//			System.out.println(sb1==sb1.append("Marathe"));
		}
	}
