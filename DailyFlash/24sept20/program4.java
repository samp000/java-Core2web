import java.util.*;

class Token4 {

	public static void main(String args[]) {

		String one = "SWARUP,A,2,324.2";
		String two = "SONIA,C,23,522.05";
		StringTokenizer stz = new StringTokenizer(one,",");

		System.out.println("Number of tokens of string one : "+stz.countTokens());

		for (int i = 1 ; i <=4;i++) {
			System.out.println(stz.nextToken(","));
		}
		System.out.println("***********************************");

		StringTokenizer stz2 = new StringTokenizer(two,",");

		System.out.println("Number of tokens of string two : "+stz2.countTokens());

		while(stz2.countTokens()>=1) {
			 System.out.println(stz2.nextToken(","));
		}
	}
}
