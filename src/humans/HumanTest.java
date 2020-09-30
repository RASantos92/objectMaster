package humans;

public class HumanTest {
	public static void main(String[] args) {
		Human player1 = new Human("Jimmy");
		Human player2 = new Human("Jhon");
		player1.toString();
		player1.attack(player2);
		player2.toString();
		System.out.println(player2);
		
		
	}
}
