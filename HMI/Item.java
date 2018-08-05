package HMI;

import java.util.*;

public class Item {
	private String name;
	Scanner input = new Scanner(System.in);
	
	public Item() {
		setName(input.nextLine());
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return String.format("%s", name);
	}
}
