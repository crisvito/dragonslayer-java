package App;

public class Item {
	
	private String name;
	private String type;
	private int price;
	private int attackDamage;
	private int defence;
	private boolean hasAntiFire;
	private int effectValue;
	
	public Item(String name, String type, int price, int attackDamage, int defence, boolean hasAntiFire,
			int effectValue) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.attackDamage = attackDamage;
		this.defence = defence;
		this.hasAntiFire = hasAntiFire;
		this.effectValue = effectValue;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}
	
	public int getSellPrice() {
		return price * 80/100;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public int getDefence() {
		return defence;
	}

	public boolean isHasAntiFire() {
		return hasAntiFire;
	}

	public int getEffectValue() {
		return effectValue;
	}
	
	public int setAttackDamage() {
		this.attackDamage = this.attackDamage + (this.attackDamage * 10 / 100);
		return this.attackDamage;
	}

}
