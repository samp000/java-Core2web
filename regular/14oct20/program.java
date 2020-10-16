
	class Demo {

		public static void main(String args[]) {

			String str1 = "Sandy";
			String str2 = "Marathe";
			String str3 = "SandyMarathe";
			String str3a = "SandyMarathe";
			String str4 = str1+str2;
			String str5 = str1.concat(str2);

			System.out.println(str3==str4); //true
			System.out.println(str3==str5); // true
			System.out.println(str3==str3a); // true

		}
	}
