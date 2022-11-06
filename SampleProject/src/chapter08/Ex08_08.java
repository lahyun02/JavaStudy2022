package chapter08;

import java.io.*;

public class Ex08_08 {
	//todo : 입력파라미터에 해당되는 디렉토리의 서브디렉토리 정보 출력하는 메소드 
	public static void listDirectory(File dir){
		System.out.println(dir.getPath() + "의 서브디렉토리 정보입니다."); 
		File[] subFiles = dir.listFiles();
		for(File f : subFiles) {
			long time = f.lastModified(); 
			System.out.println("파일명 : " + f.getName());
			System.out.println("파일크기 : " + f.length());
			System.out.println(time);
			System.out.printf("%tb %td %ta %tT\n", time, time, time, time);
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName()); 
		if(f1.isFile())
			System.out.println(f1.getName() + "은 파일입니다. ");
		else if(f1.isDirectory())
			System.out.println(f1.getName() + "은 디렉토리입니다. ");
		
		// todo : 디렉토리 생성하기
		File f2 = new File("c:\\Temp\\java_sample");
		if(!f2.exists()) 	f2.mkdir();
		// todo : 출력하기 
		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\new_java_sample")); 
		listDirectory(new File("c:\\Temp"));
		
	}

}
