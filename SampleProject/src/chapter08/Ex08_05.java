package chapter08;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08_05 {

	public static void main(String[] args) {
		byte b[] = {7, 51, 3, 4, -1, 24};
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("d:\\test.out");
//			for(byte bb : b) 
//				fout.write(bb);
			for(int i=0; i<b.length; i++)
				fout.write(b[i]);
			fout.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}
}
