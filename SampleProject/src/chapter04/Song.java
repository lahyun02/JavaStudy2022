package chapter04;

import java.util.Scanner;

public class Song {
	
	String title;
	String artist;
	int year;
	String country;
	
	Song() {}			//기본 생성자 (아무 파라미터를 안 받음)
	
	//노래 정보를 출력하는 show 메소드 
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.print(this.year + ", ");
		System.out.print(this.country + ", ");
		System.out.print(this.artist + ", ");
		System.out.println(this.title);
//		System.out.println(year + ", " + country + ", " + artist + ", " + title);
	}
	
	public static void main(String[] args) {
		Song song[] = new Song[3];
		Scanner scan = new Scanner(System.in);
		//사용자에게 title, artist, year, country를 입력받아서 
		//Song을 3개 초기화시킨다.
		
		for(int i = 0; i<song.length; i++) {
			System.out.print("타이틀, 가수, 년도, 국가 순 입력 >>> ");
			String title = scan.next();
			String artist = scan.next();
			int year = scan.nextInt();
			String country = scan.next();
			
			song[i] = new Song(title, artist, year, country); 
		}
		
		for(Song s : song) s.show();
		
		scan.close();
		
//		Song song = new Song("Dancing Queen", "ABBA", 1984, "스웨덴");
//		song.show();
		
		
	}

}
