package HMI;

import java.io.*;
import java.util.*;

public class ItemListController extends Serializer {
	
	public LinkedList<Item> items = new LinkedList<Item>();
	transient Scanner inp = new Scanner(System.in);
	
	public void generateList() {
		try {
			items = deserializeObject(items);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void updateList() {
		try {
			serializeObjectUpdate(items);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void resetList() {
		try {
			serializeObjectReset();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addItem() {
				
		Item item = new Item();
		//serialize the item
		items.add(item);
		updateList();
		System.out.println("You've just added an item!\n");
		
	}
	public void removeItem() {
		
		System.out.print("Type the index of the item you wanna remove: ");
		int index = Integer.parseInt(inp.nextLine());
		
		if((0 <= index && index <= items.size()) && items.isEmpty() == false) {
						
			items.remove(index);
			resetList();
			updateList();
			System.out.println("You've just removed an item!\n");
			
		} else {
			System.out.println("This item does not exist!\n");
		}
	}
	public void printItems() {
		System.out.printf("You have %d items:\n", items.size());
		for(Item i : items) {
			System.out.printf("-Name: %s\tNumber: %d\tPrice: %d\tDate: %s\tOrigin: %s\tPhoto: %s\n",
					i.getName(), i.getNumber(), i.getPrice(), i.getDate(), i.getOrigin(), i.getPhoto());
		}
		System.out.println();
	}
}
