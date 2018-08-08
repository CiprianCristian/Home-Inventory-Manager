package HMI;
public class Main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Thread Start = new Thread(new Runnable() {
			@Override
			public void run() {
				menu.Start();
			}
		}
		);
		Start.start();
	}
}