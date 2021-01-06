package Hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setDay(10);
		date.setMonth(77);
		date.setYear(2019);
		
		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setYear(2002);
				
	}

}