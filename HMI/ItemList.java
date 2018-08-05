package HMI;

import java.util.*;

public class ItemList {
	private static ArrayList<Item> items = new ArrayList<Item>();
	
	public static void addItem() {
		items.add(new Item());
	}
	public static void removeItem(int index) {
		items.remove(index);
	}
	public static void printItems() {
		System.out.println(items);
	}
}
