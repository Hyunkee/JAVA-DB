package day2;

import java.util.Scanner;

public class exam10 {
	public static void main(String[] args) {
		//�������� ���ϴ� ������ ����(a~b)�� ����� ���
		// a <= Math.random()*(b-a+1) + a < b+1
		int min = 1;
		int max = 3;
		// min ~ max ������ ������ �������� �����ϴ� �ڵ�
		// com�� ����(1), ����(2), ��(3)�߿��� �������� �ϳ� ����
		int com = (int)(Math.random()*(max-min+1) + min);
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ��� : > ");
		user = scan.nextInt();
		switch(user-com){
			case 0:
			System.out.println("���º��Դϴ�.");
			break;
			case -1: case 2:
			System.out.println("��ǻ�� ���Դϴ�.");
			break;
			case 1: case -2: //default:
			System.out.println("����� ���Դϴ�.");
			break;
		}
		System.out.println(com);
		scan.close();
	}
}
