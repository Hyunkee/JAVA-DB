package day2;

import java.util.Scanner;

public class exam9 {
	public static void main(String[] args) {
		/*�޷��� �� �޸��� ������ �ϼ��� �ٸ��ϴ�. ���� �ԷµǸ� �ش��ϴ� ���� ������ 
		 * �ϼ��� ����ϴ� �ڵ带 switch case���� �̿��Ͽ� �ۼ��ϼ���*/
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch(month){
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			System.out.println("31��");	break;
		case 4:	case 6:	case 9:	case 11:
			System.out.println("30��");	break;		
		case 2:
			System.out.println("28��");	break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		scan.close();
	}
}