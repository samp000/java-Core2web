
	import java.util.*;

	class Square {

		public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter side of square : ");
			int side = sc.nextInt();

			System.out.println("Length of that square: "+side);	
			System.out.println("Area: "+side*side);
			System.out.println("Perimeter: "+4*side);
		}
	}
