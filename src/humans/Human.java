package humans;

public class Human {
	public String name;
	public String type;
	public Integer health;
	public Integer str;
	public Integer stealth;
	public Integer intel; 
	public Boolean attack;
	
	public Human(String name) {
		this.name = name;
		this.type = "Human";
		this.health = 100;
		this.str = 25;
		this.stealth = 20;
		this.intel = 20;
		this.attack = true;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public Integer getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	public Integer getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public Integer getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}
	public String toString() {
		String output = "";
		output += "Name:        " + name + "\n";
		output += "Type:        " + type + "\n";
		output += "Health: 	    " + health + "\n";
		output += "Streangth:   " + str +"\n";
		output += "Stealth:     " + stealth + "\n";
		output += "Inteligence: " + intel + "\n";
		output += "Can attack?: " + (attack ? "yes" + "\n": "\n");
		
		return output;
	}
	public void attack(Human player) {
		player.setHealth(player.getHealth() - this.str);
	}
	
}
