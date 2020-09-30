package humans;

public class Ninja extends Human {
	public Ninja(String name) {
		super(name);
		this.type = "Wizard";
		this.health = 450;
		this.str = 90;
		this.stealth = 120;
		this.intel = 75;

	}

	public void steal(Human player) {
		player.setHealth(player.getHealth() + this.intel);
		this.health += this.intel;
		System.out.println("***********************************" + "\n" + this.name + " Just stole  " + this.intel
				+ " Health from  " + player.name + "\n" + "***********************************");
	}

	public void runAway() {
		this.health += -10;
		System.out.println("***********************************" + "\n" + this.name + " Had to bounce mid fight "
				+ this.name + " lost 10 health" + "\n" + "***********************************");
	}
}
