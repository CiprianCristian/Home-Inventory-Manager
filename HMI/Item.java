package HMI;

import java.util.*;

public class Item implements java.io.Serializable {
	private String name;
	private String number;
	private String price;
	private String date;
	private String origin;
	private String photo;
	
	transient Scanner input = new Scanner(System.in);
	
	public Item() {
		setDatas();
	}
	
	private void setDatas() {
		setName();
		setNumber();
		setPrice();
		setDate();
		setOrigin();
		setPhoto();
	}
	
	private void setName() {
		System.out.print("Introduce the name of it: ");
		this.name = input.nextLine();
	}
	private void setNumber() {
		System.out.print("Introduce the number of it: ");
		this.number = input.nextLine();
	}
	private void setPrice() {
		System.out.print("Introduce the price of it: ");
		this.price = input.nextLine();
	}
	private void setDate() {
		System.out.print("Introduce the date when you bought it: ");
		this.date = input.nextLine();
	}
	private void setOrigin() {
		System.out.print("Introduce the origin of it: ");
		this.origin = input.nextLine();
	}
	private void setPhoto() {
		System.out.print("Introduce a photo of it (ex: photo.img) : ");
		this.photo = input.nextLine();
	}
	
	public String getName() {
		return this.name;
	}
	public String getNumber() {
		return this.number;
	}
	public String getPrice() {
		return this.price;
	}
	public String getDate() {
		return this.date;
	}
	public String getOrigin() {
		return this.origin;
	}
	public String getPhoto() {
		return this.photo;
	}
	
	public String toString() {
		return String.format("%s %d %d %s %s %s",name,number,price,date,origin,photo);
	}
}
