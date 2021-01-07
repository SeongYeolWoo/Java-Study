package Practice;

public class Q1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		char op = '+';
		
		int result;
		
/*		if(op == '+'){
			result = num1 + num2;
		}
		else if(op == '-') {
			result = num1 - num2;
		}
		else if(op == '/') {
			result = num1 / num2;
		}
		else if(op == '*') {
			result = num1 * num2;
		}
		else if(op == '%') {
			result = num1 % num2;
		}
		else result = 0;*/
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			result = 0;
			System.out.println("Error");				
		}
		System.out.println(num1+" "+op+" "+num2 +" = "+ result);
	}
}
