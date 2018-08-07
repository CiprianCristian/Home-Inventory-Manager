package HMI;

import java.io.*;
import java.util.LinkedList;

public class Serializer {
	
	private File file = new File("Items.ser");

	public void serializeObjectReset() throws IOException {
		FileOutputStream fout = new FileOutputStream(file, false);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(null);
		
		fout.close();
		out.close();
	}
	public void serializeObjectUpdate(LinkedList<Item> list) throws IOException {
		FileOutputStream fout = new FileOutputStream(file, false);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject((LinkedList<Item>)list);
		
		fout.close();
		out.close();
	}
	public LinkedList<Item> deserializeObject(LinkedList<Item> list) throws IOException {
		try {
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			
			list.addAll((LinkedList<Item>)in.readObject());
			
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
