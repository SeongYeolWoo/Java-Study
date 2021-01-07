package Chapter5Q3;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate mydate = new MyDate(8 , 3, 1998);
		mydate.isValid();
		MyDate mydate2 = new MyDate(7, 13, 2000);
		mydate2.isValid();
	}
}
