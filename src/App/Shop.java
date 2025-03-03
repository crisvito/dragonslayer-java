package App;

import java.util.HashMap;

public class Shop {
	HashMap<String, Item> items = new HashMap<String,Item>();
	
	public Shop() {
		
	}

	public void addItem(Item item) {
		items.put(item.getName(), item);
	}
	
	public void buyItem(String nameItem, Knight knight) {
		if(!items.containsKey(nameItem)) {
			System.out.println(nameItem  +" Brew does not exist in the shop!");
			return;
		}
		if(items.get(nameItem).getPrice() > knight.getGold().getAmount()){
			System.out.println(knight.getName() + " does not have enough gold to buy " + nameItem + "!");
			return;
		}
		if(knight.getInventory().getSize() == knight.getInventory().getItem().size()) {
			System.out.println(knight.getName() + "'s inventory is full! Please upgrade the inventory!");
			return;
		}
		System.out.println(knight.getName() + " has purchased " + nameItem + "!");
		knight.setInventory(nameItem, items.get(nameItem));
		knight.getGold().setAmount(knight.getGold().getAmount() - items.get(nameItem).getPrice());
		
	}
	
	public void upgradeInventory(Knight knight, int size) {
		int price = size * 100;
		if(price > knight.getGold().getAmount()) {
			System.out.println(knight.getName() + " does not have enough gold to upgrade " + size + " more inventory!");
		}else {
			System.out.println(knight.getName() + " has successfully upgraded " + size + " more inventory!");
			knight.getInventory().setSize(size);
		}
	}
	
	public void sellItem(String itemName, Knight knight) {
		if(!knight.getInventory().getItem().containsKey(itemName)) {
			System.out.println(knight.getName() + " does not have " + itemName + " in his inventory!");
		}else {
			System.out.print(knight.getName() + " has sold " + itemName);
			System.out.println(" for " + knight.getInventory().getItem().get(itemName).getSellPrice() + " gold!");
			knight.earnGold(knight.getInventory().getItem().get(itemName).getSellPrice());
		}
	}

}
