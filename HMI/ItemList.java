package HMI;

import java.util.*;

public class ItemList {
	private static ArrayList<Item> items = new ArrayList<Item>();
	static boolean exists = true;
	
	public static void addItem() {
		items.add(new Item());
	}
	public static void removeItem(int index) {
		if(index <= items.size()) {
			exists = true;
			items.remove(index-1);
		}
		else {
			exists = false;
		}
	}
	public static void printItems() {
		System.out.println(items);
	}
}
