package practice;

import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		/*������ �Է¹޾� �Է¹��� ������ ¦������ �ƴ��� Ȯ���ϴ� �ڵ带 �ۼ��ϼ���*/
		Scanner scan = new Scanner(System.in);			
		int num = scan.nextInt();
		boolean isEven = num%2==0 ? true:false;
		//¦�� : num�� 2�� �������� �� �������� 0�� ����
		System.out.println(isEven);
		scan.close();
	}
}
