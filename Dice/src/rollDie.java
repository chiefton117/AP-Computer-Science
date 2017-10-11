
public class rollDie {
	public static void main(String[] args) {
		Die dice1 = new Die();
		Die dice2 = new Die();
		int count = 0;
		while(dice1.isDoubles(dice2) == false) {
		count++;
		System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
		dice1.roll();
		dice2.roll();
		if(dice1.isDoubles(dice2)) {
			System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
			System.out.println("Tries: " + (count++));
			break;
		}
		}
	}
}