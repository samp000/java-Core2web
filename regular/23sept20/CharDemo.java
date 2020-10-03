
	import java.io.*;

	 class CharDemo1  {

		public static void main(String args[]) throws IOException {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//	int i = Integer.parseInt(br.readLine());
		//	String str1 = br.readLine();
			char ch = (char)br.read();
		//	br.skip(1);
		//	String str = br.readLine();
		//	float fl = Float.parseFloat(br.readLine());

		//	System.out.println("i: "+i);
		//	System.out.println("ch: "+ch);
		//	System.out.println("str: "+str);
		//	System.out.println("fl: "+fl);
		
			System.out.println(br.ready());
		}
	}
