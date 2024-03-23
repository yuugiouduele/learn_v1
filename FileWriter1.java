package exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriter1 {
	public static void main(String[] args) {
		try(
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.txt"));
		DataInputStream dis=new DataInputStream(new FileInputStream("data.txt"));
		){
			dos.writeInt(1000);
			dos.writeUTF("医者の注射器");
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
