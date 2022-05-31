package chapter00;

class Date {
	int year;
	String month;
	int day;
	
	Date(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	Date(int year) {
		this.year = year;
	}
	Date() {}
	
	void printYear() {
		System.out.println("현재는 " + this.year + "년입니다. ");
	}
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		Date date = new Date(2022, "05월", 31);
		date.printYear();
	}

}
