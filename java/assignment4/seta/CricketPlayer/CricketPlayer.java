import java.util.Scanner;

public class CricketPlayer {

	String name;
	int no_of_innings, no_times_notout, total_runs;
	double bat_avg;

	public CricketPlayer() {

		Scanner ip = new Scanner(System.in);

		System.out.print("\nName : ");
		name = ip.next();
		System.out.print("No of innings : ");
		no_of_innings = ip.nextInt();
		System.out.print("No of times not out : ");
		no_times_notout = ip.nextInt();
		System.out.print("Total runs : ");
		total_runs = ip.nextInt();
	}

	public static void CalculateBattingAverage(CricketPlayer player[]) {

		for(int i = 0; i < player.length; i++) {
			try {
				player[i].bat_avg = player[i].total_runs / player[i].no_of_innings;
			}
			catch(ArithmeticException ae) {
				if(player[i].no_of_innings == 0) {
					Scanner ip = new Scanner(System.in);
					System.out.println("player " + (i + 1) + " has 0 no of innings :");
					System.out.print("Enter no of innings : ");
					player[i].no_of_innings = ip.nextInt();
					i--;
				}
			}
		}
	}

	public static void sortPlayer(CricketPlayer player[]) {

		for(int i = 0; i < player.length; i++)
			for(int j = 0; j < player.length - i - 1; j++)
				if(player[j].bat_avg < player[j + 1].bat_avg) {
					CricketPlayer temp =  player[j];
					player[j] = player[j + 1];
					player[j + 1] = temp;
				}
	}

	public static void display(CricketPlayer player[]) {

		printline(81);
		System.out.printf("| No. | %10s | No. of Inn. | No. of times not out | Total Runs | Bat. Avg |\n", "Name");
		printline(81);
		for(int i = 0; i < player.length; i++)
			System.out.printf("| %3d | %10s | %11d | %20d | %10s | %8.2f |\n", i + 1, player[i].name, player[i].no_of_innings, player[i].no_times_notout, player[i].total_runs, player[i].bat_avg);
		printline(81);
	}

	public static void printline(int n) {

		for(int i = 0; i < n; i++)
			System.out.print('-');
		System.out.println();
	} 

	public static void main(String args[]) {
		
		Scanner ip = new Scanner(System.in);

		System.out.print("How many players ? : ");
		int n = ip.nextInt();
		CricketPlayer player[] = new CricketPlayer[n];

		System.out.println("Enter player info : ");
		for(int i = 0; i < n; i++)
			player[i] = new CricketPlayer();

		CricketPlayer.CalculateBattingAverage(player);
		CricketPlayer.sortPlayer(player);
		CricketPlayer.display(player);
	}

}

