package App;

public class Dragon {
	private String name;
	private int health;
	private int clawDamage;
	private int fireDamage;
	private int rank;
	public Dragon(String name, int health, int clawDamage, int fireDamage, int rank) {
		this.name = name;
		this.health = health;
		this.clawDamage = clawDamage;
		this.fireDamage = fireDamage;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getClawDamage() {
		return clawDamage;
	}
	public int getFireDamage() {
		return fireDamage;
	}
	public int getRank() {
		return rank;
	}
	
	public int setHealth(int health) {
		this.health = health;
		return health;
	}
	
	public void attack(Knight knight, String type) {
		int armor = 0;
		if(knight.getEquippedArmor() != null) {
			armor = knight.getEquippedArmor().getDefence();
		}
		
		
		if(knight.getHealth() <= 0) {
			System.out.println(knight.getName() + " Already died!");
			return;
		}
		
		if(type == "CLAW") {
			int newClawDamage = clawDamage - armor;
			if(newClawDamage <= 0) System.out.println(knight.getName() +" has successfully blocked the dragon's attack!");
			else {
				int healthNow = knight.setHealth(knight.getHealth() - clawDamage);
				System.out.print("Dealing "+ newClawDamage + " damage to " + knight.getName() + "! ");
				System.out.println(name + " need " + healthNow + " more damage to defeat the knight!");
			}
		}else if(type == "FIRE") {
			int newFireDamage = fireDamage - armor;
			if(knight.getEquippedArmor() != null) {
				if(knight.getEquippedArmor().isHasAntiFire()) newFireDamage = newFireDamage - (newFireDamage * 20 / 100);
			}
			if(newFireDamage <= 0) System.out.println(knight.getName() +" has successfully blocked the dragon's attack!");
			else {
				int healthNow = knight.setHealth(knight.getHealth() - newFireDamage);
				System.out.print("Dealing "+ newFireDamage + " damage to " + knight.getName() + "! ");
				if(healthNow <= 0) {
					System.out.println(knight.getName() + " has been defeated by " + name );
				}else {
					System.out.println(name + " need " + healthNow + " more damage to defeat the knight!");
				}
			}
		}
	}
	
	public void buff() {
		clawDamage = clawDamage + (clawDamage * 10 /100);
		fireDamage = fireDamage + (fireDamage * 25 /100);
		health = health + (health * 10 /100);
		System.out.println("Obsidian Dreadwing has buffed his abilities!");
	}
}
