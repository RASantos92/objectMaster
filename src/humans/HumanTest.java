package humans;

public class HumanTest {
	public static void main(String[] args) {

		Human player1 = new Human("Jimmy");
		Human player2 = new Human("Jhon");
		player1.toString();
		player1.attack(player2);
		player2.toString();

		Wizard player3 = new Wizard("Tommy");
		player3.healHuman(player2);
		player3.firball(player2);

		Ninja player4 = new Ninja("That one dude");
		player4.steal(player2);
		player4.runAway();
		player2.toString();

		Samurai player5 = new Samurai("Kobiashi");
		player5.deathBlow(player2);
		player5.meditate();
		player5.toString();
		System.out.println(player5);
		System.out.println(player2);
		System.out.println(" Samurai count: " + Samurai.getNumberOfSamurai());
		System.out.println(" Wizards count: " + Wizard.getNumberOfWizards());
		System.out.println(" Ninjas count: " + Ninja.getNumberOfNinjas());
		System.out.println(" Humans count: " + Samurai.getNumberOfHumans());

	}
}
