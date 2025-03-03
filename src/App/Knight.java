package App;

public class Knight {
	private String name;
	private int health = 1000;
	private Gold gold;
	private Item equippedSword = null;
	private Item equippedArmor = null;
	private Inventory inventory = new Inventory(3);
	
	public Knight(String name, Gold gold) {
		this.name = name;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public Gold getGold() {
		return gold;
	}

	public Item getEquippedSword() {
		return equippedSword;
	}

	public Item getEquippedArmor() {
		return equippedArmor;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	
	public int setHealth(int health) {
		this.health = health;
		return health;
	}
	
	public void setInventory(String name, Item item) {
		inventory.setItem(name, item);
	}
	
	public void attack(Dragon dragon) {
		if(dragon.getHealth() <= 0) {
			System.out.println(dragon.getName() + " Already died!");
			return;
		}
		
		if(equippedSword == null) {
			System.out.println(name + " is not using any kind of sword!");
		}else {
			int healthNow = dragon.setHealth(dragon.getHealth() - equippedSword.getAttackDamage());
			System.out.print("Dealing "+ equippedSword.getAttackDamage() + " damage to " + dragon.getName() + "! ");
			if(healthNow <= 0) {
				System.out.println(dragon.getName() + " has been defeated by " + name + "!");
				earnGoldbyDragon(dragon.getRank() * 5);
			}else {
				System.out.println("You need " + healthNow + " more damage to defeat the dragon!");
			}
		}
	}
	
	public void equipSword(String nameItem) {
		if(!inventory.getItem().containsKey(nameItem)) {
			System.out.println(name + " does not have " +  nameItem + " in the inventory!");
		}else {
			System.out.println(name + " is equipping " +  nameItem + "!");
			equippedSword = inventory.getItem().get(nameItem);
		}
	}
	
	public void equipArmor(String nameItem) {
		if(!inventory.getItem().containsKey(nameItem)) {
			System.out.println(name + " does not have " +  nameItem + " in the inventory!");
		}else {
			System.out.println(name + " is equipping " +  nameItem + "!");
			equippedArmor = inventory.getItem().get(nameItem);
		}
	}
	
	public void unequipSword() {
		equippedSword = null;
	}
	
	public void unequipArmor() {
		equippedArmor = null;
	}
	
	public void enhanceWeapon() {
		if(gold.getAmount() >= 500) {
			System.out.println(name + " has enhanced " + equippedSword.getName() + "!");
			equippedSword.setAttackDamage();
			gold.setAmount(500);
		}else {
			System.out.println(name + " does not have enough gold to enhance the weapon!");
		}
	}
	
	public void useConsumable(String name) {
		health += inventory.getItem().get(name).getEffectValue();
		inventory.getItem().remove(name);
		System.out.println("Darius has purchased " + name + "!" + "(Health: " + health + ")");
	}
	
	public void earnGold(int amount) {
		gold.setAmount(gold.getAmount()+amount);
		System.out.println(name + " earned " + amount + " gold!");
	}
	
	public void earnGoldbyDragon(int amount) {
		gold.setAmount(gold.getAmount()+amount);
		System.out.println(name + " earned " + amount + " gold by killing dragon!");
	}
}






