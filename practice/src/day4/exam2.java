package day4;

import java.util.Scanner;

public class exam2 {
	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 연산 결과를 출력하는 코드를 작성하세요.
		int num , num2;
		char op;
		
		Scanner scan = new Scanner(System.in);					
		num  = scan.nextInt();		
		num2  = scan.nextInt();
		op = scan.next().charAt(0);
		
		
		switch (op){
		case '+':
			System.out.println("" + num + op + num2 + "=" + (num + num2));
			
			break;
		case '-':
			System.out.println("" + num + op + num2 + "=" + (num - num2));
			
			break;
		case '*':
			System.out.println("" + num + op + num2 + "=" + (num * num2));
			
			break;
		case '/':
			System.out.println("" + num + op + num2 + "=" + (num / num2));
			
			break;
		case '%':
			switch(num2){
				case 0:
					System.out.println("0으로 나눌 수 없습니다");
					break;
				default:
					System.out.println("" + num + op + num2 + "=" +((double)num % num2));
			}
		default:
		}
		scan.close();
	}
}
