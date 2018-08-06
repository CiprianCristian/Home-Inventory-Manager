package HMI;

import java.io.*;
import java.util.*;

public class ItemList {
	
	private static File file = new File("Items.txt");
	static boolean exists = false;
	private static LinkedList<String> items = new LinkedList<String>();
	
	public static void generateList() throws IOException {
		FileReader fReader = new FileReader(file);
		BufferedReader in = new BufferedReader(fReader);
		
		String s = in.readLine();
		while(s != null) {
			items.add(s);
			s = in.readLine();
		}
		
		in.close();
	}
	
	public static void addItem() throws IOException {
		Item item = new Item();
		FileWriter fWriter = new FileWriter(file, true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		PrintWriter out = new PrintWriter(bWriter);

		String s = item.getName();
		items.add(s);
		out.println(s);
		System.out.println("You've just added an item!\n");
		
		out.flush();
		out.close();
	}
	public static void removeItem(int index) throws IOException {
		FileReader fReader = new FileReader(file);
		BufferedReader in = new BufferedReader(fReader);
		
		if(0 <= index && index <= items.size()) {
			exists = true;
			items.remove(index);
			System.out.println("You've just removed an item!\n");
		}
		in.close();

		if(exists == true) {
			FileWriter fWriter = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			PrintWriter out = new PrintWriter(bWriter);
			
			for(String i : items) {
				out.println(i);
			}
			
			out.flush();
			out.close();
		} else if(exists == false) {
			System.out.println("This item does not exist!\n");
		}
	}
	public static void printItems() {
		for(String i : items) {
			System.out.println('-' + i);
		}
		System.out.println();
	}
}
