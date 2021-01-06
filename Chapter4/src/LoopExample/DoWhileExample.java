package LoopExample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
	/*	int num = 1;
		int sum = 0;
		
		do {
			sum += num++;
		}while( num <= 10 );
		System.out.println("1부터 "+(num-1)+"까지의 합은 "+sum+"입니다.");*/
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
