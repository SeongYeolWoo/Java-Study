package ifExample;

//import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
/*		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if( score >= 90 && score <= 100) {
			System.out.println("���� : A");
		}
		else if( score >= 80) {
			System.out.println("���� : B");
		}
		else if( score >= 70) {
			System.out.println("���� : C");
		}
		else if( score >= 60){
			System.out.println("���� : D");
		}
		else {
			System.out.println("���� : F");
		}
		scanner.close();
		*/
		
		int a = 10;
		int b = 20;
		int max;
		
		max = (a>b)?a:b;
		System.out.println(max);
	}

}