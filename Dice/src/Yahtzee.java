
public class Yahtzee {
	public static void main(String[] args) {
	
		Die dice1 = new Die();
		Die dice2 = new Die();
		Die dice3 = new Die();
		Die dice4 = new Die();
		Die dice5 = new Die();
		dice1.setSides(6);
		Die[] dieArray = {dice1, dice2, dice3, dice4, dice5};
		for (Die dice : dieArray) {
			System.out.println(dice);
		}
	}
}
