package LoopExample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
	//	int num = 1;
	//	int sum = 0;
		
	/*	while( num <= 10 ) {
			sum += num++;
		}
		System.out.println("1���� "+(num-1)+"������ ���� "+sum+"�Դϴ�.");*/
		int input;
		
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		int sum = 0;
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		scanner.close();
		System.out.println(sum);
	}
}
