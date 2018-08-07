package HMI;

import java.io.*;
import java.util.LinkedList;

public class Serializer {
	
	private File file = new File("Items.ser");

	public void serializeObjectUpdate(LinkedList<LinkedList<Item>> list) throws IOException {
		FileOutputStream fout = new FileOutputStream(file, false);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject((LinkedList<LinkedList<Item>>)list);
		
		fout.close();
		out.close();
	}
	public LinkedList<LinkedList<Item>> deserializeObject(LinkedList<LinkedList<Item>> list) throws IOException {
		try {
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);

			list = (LinkedList<LinkedList<Item>>)in.readObject();
			
			fin.close();
			in.close();
		} catch(EOFException e) {
			//ignore..
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
