package LoopExample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
	/*	int num = 1;
		int sum = 0;
		
		do {
			sum += num++;
		}while( num <= 10 );
		System.out.println("1���� "+(num-1)+"������ ���� "+sum+"�Դϴ�.");*/
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
		}while( input != 0 );
		scanner.close();
		System.out.println(sum);
	}
}
