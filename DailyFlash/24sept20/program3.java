
	import java.util.*;

	class Token3 {
		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);

			for(int i =1; i<=3 ;i++) {
		
				String str = sc.nextLine();
				StringTokenizer stz = new StringTokenizer(str,",");
				String StudentName = stz.nextToken();
				//char Grade = stz.nextToken().charAt(0);
				char Grade = stz.nextToken().trim().charAt(0);
				int Age = Integer.parseInt(stz.nextToken());
				double Marks = Double.parseDouble(stz.nextToken());

				System.out.println("Name: "+StudentName);
				System.out.println("Grade: "+Grade);
				System.out.println("Age: "+Age);
				System.out.println("Marks: "+Marks +"\n-------------------------------------");
			}
		}
	}
