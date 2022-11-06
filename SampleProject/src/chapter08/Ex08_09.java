package chapter08;
import java.io.*;

public class Ex08_09 {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\system.ini");
		File dst = new File("d:\\system.txt"); 
		FileReader fr = null;
		FileWriter fw = null;

		try {
			int c;
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			while( (c = fr.read()) != -1 ) 
				fw.write((char)c); 
			fr.close();
			fw.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}
}
