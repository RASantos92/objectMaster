package humans;

public class Samurai extends Human {
	private static Integer numberOfSamurai = 0;

	public Samurai(String name) {
		super(name);
		this.type = "Samurai";
		this.health = 450;
		this.str = 90;
		this.stealth = 120;
		this.intel = 75;
		numberOfSamurai++;

	}

	public static Integer getNumberOfSamurai() {
		return numberOfSamurai;
	}

	public void deathBlow(Human player) {
		player.setHealth(player.getHealth() - player.getHealth());
		this.health = this.health / 2;
		System.out.println("***********************************" + "\n" + this.name + " Just destroyed  " + player.name
				+ " took  " + this.health / 2 + " Damage " + "\n" + "***********************************");
	}

	public void meditate() {
		this.health += this.health / 2;
		System.out.println("***********************************" + "\n" + this.name + " Channeled his chi for "
				+ this.health / 2 + "\n" + "***********************************");
	}
}
