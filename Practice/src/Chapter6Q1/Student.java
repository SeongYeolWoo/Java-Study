package Chapter6Q1;

import java.util.ArrayList;

public class Student {
	String studentName;
	int StudentID;
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public Student(String studentName, int StudentID) {
		this.studentName = studentName;
		this.StudentID = StudentID;
	}
	
	public void addBook(String Bookname, String author) {
		Book book = new Book(Bookname, author);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName + "학생이 읽은 책은 : ");
		for(Book book:bookList) {
			System.out.print(book.getBookName() + " ");
		}
		System.out.println(" 입니다.");
	}
}
