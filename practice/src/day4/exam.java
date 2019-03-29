package day4;

import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 합을 출력하는 코드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		int num , num2;		
		num  = scan.nextInt();
		num2  = scan.nextInt();
		System.out.println(num+num2);
		/*System.out.println(num+"과"+ num2+"의 합 : "+(num+num2));*/
		
		scan.close();
	}
}
