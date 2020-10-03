
	import java.io.*;
	class IPLTeam {


			String teamName;
			String captain;
			int jerseyNum;
			String franchiseOwner;
			int countOfTrophiesWon;

			public static void main(String args[]) throws IOException {

				IPLTeam t1 = new IPLTeam();

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					System.out.print("Enter team name:");
					t1.teamName = br.readLine();

					System.out.print("Enter captain name:");
					t1.captain = br.readLine();

					System.out.print("Enter jersey number of " +t1.captain +" : ");
					t1.jerseyNum = Integer.parseInt(br.readLine());

					System.out.print("Enter Franchise Owner of " +t1.teamName +" : ");
					t1.franchiseOwner = br.readLine();

					System.out.print("Enter number of IPL trophis won by " +t1.teamName +":");
					t1.countOfTrophiesWon=Integer.parseInt(br.readLine());

					System.out.println("\n Team name:" +t1.teamName);
					System.out.println("Captain name:" +t1.captain);
					System.out.println("Jersey number of " +t1.captain +" : " +t1.jerseyNum);
					System.out.println("Franchise Owner of " +t1.teamName +" : " +t1.franchiseOwner);	
					System.out.println("Number of IPL trophis won by " +t1.teamName +":" +t1.countOfTrophiesWon);

			}
	}
