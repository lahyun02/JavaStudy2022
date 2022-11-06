package chapter08;
import java.io.*;

public class Ex08_10 {

	public static void main(String[] args) {
		File src = new File("d:\\ocean.jpg");
		File dst = new File("d:\\ocean_copy.jpg"); 
		FileInputStream fr = null;
		FileOutputStream fw = null;

		try {
			int c;
			fr = new FileInputStream(src);
			fw = new FileOutputStream(dst);
			while( (c = fr.read()) != -1 ) 
				fw.write((byte)c); 
			fr.close();
			fw.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}
}
