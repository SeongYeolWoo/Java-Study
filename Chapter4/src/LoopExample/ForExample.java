package LoopExample;

public class ForExample {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		for(int i = 1; i < 11 ; i++, count++) {
			sum += count;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while(num<=10) {
			total += num++;
		}
		System.out.println(total);
	}
}
