package HMI;

import java.util.*;

public class Menu {

	private static int option;
	private static Scanner input = new Scanner(System.in);

	public void Start() {
		option = 0;
		do {
			System.out.print("Choose the option:\n"
					+ "1.Add Items\n"
					+ "2.Remove Items\n"
					+ "3.Print Items\n"
					+ "4.Exit\n"
					+ "You choose: ");
			option = Integer.parseInt(input.nextLine());
			System.out.println();
			Options(option);
		} while(option != 4);
	}
	private static void Options(int option) {
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
	
	private static void Option1() {
		AddingMenu.Start();
	}
	private static void Option2() {
		RemovingMenu.Start();
	}
	private static void Option3() {
		PrintingMenu.Start();
	}
	private static void Option4() {
		System.out.println("The program will close...");
		input.close();
	}
	private static void OptionDefault() {
		System.out.println("This option doesn't exist yet!\n"
				+ "Choose wisely this time!\n");
	}
}
