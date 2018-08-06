package HMI;

import java.io.IOException;
import java.util.*;

public class Menu {

	private int option;
	private Scanner input = new Scanner(System.in);
	public void Start() {
		try {
			ItemList.generateList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			System.out.print("Choose the option:\n"
					+ "1.Add Item\n"
					+ "2.Remove Item\n"
					+ "3.Print Items\n"
					+ "4.Exit\n"
					+ "You choose: ");
			option = input.nextInt();
			System.out.println();
			this.Options(option);
		} while(option != 4);
		
	}
	public void Options(int option) {
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
		case 4:
			Option4();
			break;
		default:
			OptionDefault();
			break;
		}
	}
	
	private void Option1() {
		System.out.print("Type the name of the item you wanna add: ");
		try {
			ItemList.addItem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void Option2() {
		System.out.print("Type the index of the item you wanna remove: ");
		try {
			ItemList.removeItem(input.nextInt());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void Option3() {
		System.out.println("Your items are:");
		ItemList.printItems();
	}
	private void Option4() {
		System.out.println("The program will close...");
	}
	private void OptionDefault() {
		System.out.println("This option doesn't exist yet!\n"
				+ "Choose wisely this time!");
	}
}
