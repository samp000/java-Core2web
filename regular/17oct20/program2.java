
	class StringBufferDemo2 {

		public static void main(String args[]) {

			StringBuffer sb1 = new StringBuffer();
			System.out.println(sb1.capacity());
			sb1.append("SandeshMarathe33366699i9");
			System.out.println(sb1.capacity());

			StringBuffer sb2 = new StringBuffer(100);
			System.out.println("Size sb2:"+sb2.capacity());

		}
	}
