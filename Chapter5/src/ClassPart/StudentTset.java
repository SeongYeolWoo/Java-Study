package ClassPart;

public class StudentTset{

	public static void main(String[] args) {
		
		Student studentLee = new Student("�̼���");
		studentLee.address = "����";
		studentLee.showStudentInfo();
	
		Student studentKim = new Student(100, "������");
//		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
//		System.out.println(studentLee);
	//	System.out.println(studentKim);
	}
}
