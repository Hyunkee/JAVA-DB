package practice;

import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		/*정수를 입력받아 입력받은 정수가 짝수인지 아닌지 확인하는 코드를 작성하세요*/
		Scanner scan = new Scanner(System.in);			
		int num = scan.nextInt();
		boolean isEven = num%2==0 ? true:false;
		//짝수 : num를 2로 나누었을 때 나머지가 0과 같다
		System.out.println(isEven);
		scan.close();
	}
}
