package HMI;
import java.util.*;
public class Menu {
	private static int option;
	private static Scanner input = new Scanner(System.in);
	public void Start() {
		option = 0;
		Option4();
		do {
			System.out.print("Choose the option:\n"
					+ "1.Add Items\n"
					+ "2.Remove Items\n"
					+ "3.Print Items\n"
					+ "4.Help\n"
					+ "5.Exit\n"
					+ "You choose: ");
			option = Integer.parseInt(input.nextLine());
			System.out.println();
			Options(option);
		} while(option != 5);
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
		case 5:
			Option5();
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
		System.out.println("   WEELCOME TO YOOUR SWEET\n"
						 + "   HOME INVENTORY MANAGER!\n"
						 + "|It had been designed to keep\n"
						 + "|informations about your home\n"
						 + "|inventory, like your money$,\n"
						 + "|your bike, your wife or even\n"
						 + "|your meth resources! ENJOY!!\n"
						 + "|created by @Ciprian Cristian\n"
						 + "----------How-T-Use----------\n"
						 + "-just type the option number-\n"
						 + "----------ThisIsHow----------\n");
	}
	private static void Option5() {
		System.out.println("The program will close...");
		input.close();
	}
	private static void OptionDefault() {
		System.out.println("This option doesn't exist yet!\n"
				+ "Choose wisely this time!\n");
	}
}