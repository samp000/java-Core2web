	class StringByte {

		public static void main(String args[]) {

			byte[] barr = {99,33,33,65,66,67,68,69,99,33,33};

			String str = new String(barr);

			for(int i=0;i<str.length();i++) {

				int ch =str.charAt(i);
				if(ch==99)
					ch=(int)ch+127;
				System.out.print((char)ch);
			}
			System.out.println();
		}
	}
