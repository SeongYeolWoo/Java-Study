package Chapter6Q1;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee", 1001);
		studentLee.addBook("�¹���1","������");
		studentLee.addBook("�¹���2","������");
		
		Student studentKim = new Student("Kim", 1002);
		studentKim.addBook("����1", "�ڰ渮");
		studentKim.addBook("����2", "�ڰ渮");
		studentKim.addBook("����3", "�ڰ渮");
		
		Student studentCho = new Student("Cho", 1003);
		studentCho.addBook("�ظ�����1", "���� �Ѹ�");
		studentCho.addBook("�ظ�����2", "���� �Ѹ�");
		studentCho.addBook("�ظ�����3", "���� �Ѹ�");
		studentCho.addBook("�ظ�����4", "���� �Ѹ�");
		studentCho.addBook("�ظ�����5", "���� �Ѹ�");
		studentCho.addBook("�ظ�����6", "���� �Ѹ�");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
		
	}

}
