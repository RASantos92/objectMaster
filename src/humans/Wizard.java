package humans;

public class Wizard extends Human {
	public Wizard(String name) {
		super(name);
		this.type = "Wizard";
		this.health = 200;
		this.str = 80;
		this.stealth = 30;
		this.intel = 50;

	}

	public void healHuman(Human player) {
		player.setHealth(player.getHealth() + this.intel);
		System.out.println("***********************************" + "\n" + this.name + " Just healed " + player.name
				+ ". Health increaed by  " + this.intel + "\n" + "***********************************");
	}

	public void firball(Human player) {
		player.setHealth(player.getHealth() - this.intel);
		System.out.println("***********************************" + "\n" + this.name + " Shot a firball at "
				+ player.name + ". damage delt  " + this.intel + "\n" + "***********************************");
	}
}
