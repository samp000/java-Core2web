import java.util.*;

class Token5 {

	public static void main(String args[]) {

		Scanner sc = new Scanner (System.in);
		String del = " " ;
		for(int i = 1;i<=4;i++) {					
			String str = sc.nextLine();
		
			if(i==1)
				del = " ";
			else if(i==2)
				del = ",";
			else if(i==3)
				del = ":";
			else
				del="-";
			
			StringTokenizer stz = new StringTokenizer(str,del);


			System.out.println("**************************************");
			System.out.println("Number of Tokens: " +stz.countTokens());
			
			while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken(del));
			}
			System.out.println("**************************************");
		}
	}
}

