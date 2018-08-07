package HMI;

import java.io.IOException;
import java.util.*;

public class Menu {

	private int option;
	private Scanner input = new Scanner(System.in);
	ItemListController list = new ItemListController();

	public void Start() {
		list.generateList();
		do {
			System.out.print("Choose the option:\n"
					+ "1.Add Item\n"
					+ "2.Remove Item\n"
					+ "3.Print Items\n"
					+ "4.Exit\n"
					+ "You choose: ");
			if(input.hasNext()) {
				option = input.nextInt();
			} else {
				System.out.println("it has not");
				option = 4;
			}
			
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
		list.addItem();
	}
	private void Option2() {
		list.removeItem();
	}
	private void Option3() {
		list.printItems();
	}
	private void Option4() {
		System.out.println("The program will close...");
		input.close();
	}
	private void OptionDefault() {
		System.out.println("This option doesn't exist yet!\n"
				+ "Choose wisely this time!\n");
	}
}
