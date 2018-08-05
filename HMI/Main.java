package HMI;

import java.util.*;

public class Main extends ItemList {
	
	public static void main(String[] args) {
		
		
		Thread Start = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Alegeti optiunea:\n"
								 + "1.addItem\n"
								 + "2.removeItem\n"
								 + "3.printItem\n"
								 + "4.Exit");
				int option = 0;
				Scanner input = new Scanner(System.in);
				do {
					option = input.nextInt();
					switch(option) {
						case 1:
							addItem();
							break;
						case 2:
							removeItem(input.nextInt());
							break;
						case 3:
							printItems();
							break;
						case 4:
							System.out.println("The program will close...");
							option = 4;
							break;
						default:
							System.out.println("This option doesn't exist!\n"
											 + "The program will close...");
							option = 4;
							break;
					}
				} while(option != 4);
				input.close();
			}
		});
		
		Start.start();
	}
	
}
