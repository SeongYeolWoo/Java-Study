package LoopExample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan = 2;
		int count = 1;
		
		/*for(dan = 2; dan < 10; dan++) {
			System.out.println(dan + "´Ü");
			for(count = 1; count<10; count++) {
				System.out.println(dan +" x " + count +" = " + dan*count );
			}
		}*/
		
		while( dan <= 9) {
			count = 1;
			System.out.println(dan + "´Ü");
			while(count <= 9) {
				System.out.println(dan +" x " + count +" = " + dan*count++ );
			}
			dan++;
		}
	}

}
