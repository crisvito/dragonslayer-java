package App;

import java.util.HashMap;

public class Inventory {
	private int size; 
	HashMap<String, Item> items = new HashMap<String, Item>();
	
	public Inventory(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int addedSize) {
		this.size = this.size + addedSize;
	}
	
	public void setItem(String name, Item item) {
		items.put(name,item);
	}
	
	public HashMap<String, Item> getItem() {
		return items;
	}
}
