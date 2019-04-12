package day14;

public class Exam3me {
	public static void main(String[] args) {
		/* 1 + 2i + 3 + 4i = 4 + 6i 
		 * 
		 * 허수1의 실수부 : 1
		 * 허수1의 허수부 : 2
		 * 허수2의 실수부 : 3
		 * 허수2의 허수부 : 4
		 * (1 + 2i) + (3 + 4i) = (4 + 6i)
		 * (1 + 2i) - (3 + 4i) = (-2 -2i)*/
		
		int num = 1; 
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		char op = '-';
		
		switch (op){
		case '+':
			System.out.println((num+num2)+""+op+(num3+num4)+"i");
			
			break;
		case '-':
			System.out.println((num+num2)+""+op+(num3+num4)+"i");
			
			break;
		default:
		}		
	}
}
