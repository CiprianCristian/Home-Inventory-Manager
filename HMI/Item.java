package HMI;
import java.util.*;
public class Item implements java.io.Serializable {
	private String name;
	private String price;
	private String date;
	private String origin;
	private String photo;
	private String note;
	transient Scanner input = new Scanner(System.in);	
	public Item() {
		setDatas();
	}	
	private void setDatas() {
		setName();
		setPrice();
		setDate();
		setOrigin();
		setPhoto();
		setNote();
	}	
	private void setName() {
		System.out.print("Introduce the name of it: ");
		this.name = input.nextLine();
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
	private void setNote() {
		System.out.print("Introduce a note of it: ");
		this.note = input.nextLine();
	}
	public String getName() {
		return this.name;
	}
	public String getNote() {
		return this.note;
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
}