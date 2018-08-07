package HMI;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintingMenu {
	
	private static int option;
	private static Scanner input = new Scanner(System.in);
	private static ItemListController list = new ItemListController();

	public static void Start() {
		option = 0;
		System.out.println("The menu of Printing!");
		while(option != 3) {
			list.generateList();

			System.out.print("Choose the option:\n"
					+ "1.Print all the lists\n"
					+ "2.Print just a list\n"
					+ "3.Back\n"
					+ "You choose: ");
			option = Integer.parseInt(input.nextLine());
			System.out.println();
			Options();
		}
	}
	private static void Options() {
		switch(option) {
		case 1:
			Option1();
			break;
		case 2:
			Option2();
			break;
		case 3:
			Option3();
			break;
		default:
			OptionDefault();
			break;
		}
	}
	private static void Option1() {
		list.printLists();
	}
	private static void Option2() {
		if(!ItemListController.catList.isEmpty() && ItemListController.catList != null) {
			System.out.print("Type the index of the list you want to print: ");
			int index = Integer.parseInt(input.nextLine());
			
			if((0 <= index && index < ItemListController.catList.size()) && ItemListController.catList.isEmpty() == false) {
				
				list.printItems(ItemListController.catList.get(index));

			} else {
				System.out.println("This list does not exist!\n");
			}
		} else {
			System.out.println("There are no lists, buddy!\n");
		}
		
	}
	private static void Option3() {
		System.out.println("Backing...\n");
	}
	private static void OptionDefault() {
		System.out.println("This option doesn't exist yet!\n"
				+ "Choose wisely this time!\n");
	}
}
