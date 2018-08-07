package HMI;

import java.util.Scanner;

public class AddingMenu {
	
	private static int option;
	private static Scanner input = new Scanner(System.in);
	private static ItemListController list = new ItemListController();

	public static void Start() {
		option = 0;
		System.out.println("The menu of Adding!");
		while(option != 3) {
			list.generateList();

			System.out.print("Choose the option:\n"
					+ "1.Add an item to a new list\n"
					+ "2.Add an item\n"
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
		list.addList();
	}
	private static void Option2() {
		list.addItem();
	}
	private static void Option3() {
		System.out.println("Backing...\n");
	}
	private static void OptionDefault() {
		System.out.println("This option doesn't exist yet!\n"
				+ "Choose wisely this time!\n");
	}
}
