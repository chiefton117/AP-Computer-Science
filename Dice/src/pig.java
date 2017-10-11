import java.util.Scanner;
public class pig {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Die dice1 = new Die();
		Die dice2 = new Die();
		int roundScore = 0;
		int totalScore = 0;
		System.out.println("Do you want to play a game? y/n");
		if (input.nextLine().equals("y")) {

				Scanner choiceScan = new Scanner(System.in);
				String choice = choiceScan.next();
				System.out.println("Roll die, or give up turn?");
				if (choice.toLowerCase().equals("roll")) {
					System.out.println(dice1);
					System.out.println(dice2);
				}
				else if (choice.toLowerCase().equals("give")) {
					System.out.println("aaa");
				}
			
			
			
	}
		while (input.next().equals("n")) {
			System.out.println("Please choose a valid option");
		}
		input.close();
	}
}
