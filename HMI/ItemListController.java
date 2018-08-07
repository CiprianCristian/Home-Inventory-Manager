package HMI;

import java.io.*;
import java.util.*;

public class ItemListController extends Serializer {
	
	public static LinkedList<LinkedList<Item>> catList = new LinkedList<LinkedList<Item>>();
	public LinkedList<Item> items = new LinkedList<Item>();
	
	transient Scanner inp = new Scanner(System.in);
	
	public void generateList() {
		try {
			catList = deserializeObject(catList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void updateList() {
		try {
			serializeObjectUpdate(catList);
		} catch(IOException e) {
			e.printStackTrace();
		}
		generateList();

	}
	
	public void addItem() {
		generateList();

		if(catList.isEmpty() == false) {
			printLists();
			
			System.out.print("Type the index of the list where you want to add the item: ");
			int index = Integer.parseInt(inp.nextLine());
			if(0 <= index && index < catList.size()) {
				items.clear();
				
				items.add(new Item());
				System.out.println("You've just added an item!\n");
				catList.get(index).addAll(items);
				
				updateList();
			} else {
				System.out.println("This list does not exist!\n");
			}
			
		} else {
			System.out.println("Create a list first, buddy!\n");
		}
	}
	public void removeItem() {
		generateList();
		
		if(catList.isEmpty() == false) {
			printLists();
			
			items.clear();
			System.out.print("Type the index of the list where you want to remove the item: ");
			int catIndex = Integer.parseInt(inp.nextLine());
			items.addAll(catList.get(catIndex));
			
			System.out.print("Type the index of the item you want to remove: ");
			int index = Integer.parseInt(inp.nextLine());
			
			if((0 <= index && index < items.size()) && items.isEmpty() == false) {
							
				items.remove(index);
				catList.get(catIndex).clear();
				catList.get(catIndex).addAll(items);
				System.out.println("You've just removed an item!\n");
				updateList();

			} else {
				System.out.println("This item does not exist!\n");
			}
		} else {
			System.out.println("There are no items, buddy!\n");
		}
	}
	public void printItems(LinkedList<Item> list) {
		System.out.printf("You have %d item(s) on this category:\n", list.size());
		for(Item i : list) {
			System.out.printf("-Name: %s\tNumber: %s\tPrice: %s\tDate: %s\tOrigin: %s\tPhoto: %s\n",
					i.getName(), i.getNumber(), i.getPrice(), i.getDate(), i.getOrigin(), i.getPhoto());
		}
		System.out.println();
	}
	
	public void addList() {
		generateList();

		items = new LinkedList<Item>();
		items.add(new Item());
		System.out.println("You've just added an item!\n");

		catList.add(items);
		updateList();
		System.out.println("List added. Sorry, it is noname.\n");
	}
	public void removeList() {
		generateList();

		if(catList.isEmpty() == false) {
			printLists();
			
			System.out.print("Type the index of the list that you want to remove: ");
			int index = Integer.parseInt(inp.nextLine());
			
			if((0 <= index && index < catList.size()) && catList.isEmpty() == false) {
							
				catList.remove(index);
				System.out.println("You've just removed a list!\n");
				updateList();

			} else {
				System.out.println("This list does not exist!\n");
			}
		} else {
			System.out.println("There are no lists, buddy!\n");
		}
	}
	public void printLists() {
		generateList();

		if(catList.isEmpty() == false) {
			System.out.println("Your lists are:");
			for(int index = 0; index < catList.size() && catList.isEmpty() == false; index++) {
				
				System.out.printf("Category %d : ", index);
				LinkedList<Item> cat = new LinkedList<Item>();
				cat = catList.get(index);
				printItems(cat);
				
			}
		} else {
			System.out.println("There are no lists, buddy!\n");
		}
			
	}
}
