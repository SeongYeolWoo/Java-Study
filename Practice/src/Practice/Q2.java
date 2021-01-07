package Practice;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("홀수 값을 입력하세요.");
		int num = scanner.nextInt();
		scanner.close();
		int space = num/2 + 1;
		int star = 1;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			System.out.println();
			if(i >= num/2) {
				space++;
				star-=2;
			}
			else {
				space--;
				star += 2;
			}	
		}
	}
}