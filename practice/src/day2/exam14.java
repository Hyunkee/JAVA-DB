package day2;

import java.util.Scanner;

public class exam14 {
	public static void main(String[] args) {
		/*������ �Է¹޾� �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ�
		�ڵ带 �ݺ����� �̿��Ͽ� �ۼ��ϼ���.
		
		�Ҽ� : ����� 1�� �ڱ��ڽ��� ��
		��� : �ڽź��� �۰ų� ���� �� �߿��� ������ �������� 0�� ��
		4�� ��� : 1, 2, 4*/
		int num, i, cnt;
		//num : �Է¹��� ���� cnt : ����� ���� i : �ݺ������� ����� ����
		Scanner scan = new Scanner(System.in);		
		num = scan.nextInt();		
		//�ݺ�Ƚ�� : i�� 1���� num���� �۰ų� ���� ������ 1�� �����Ѵ�
		for(i=1,cnt=0; i<=num; i++){
			//i�� num�� ����̸� ����� ������ �ϳ� ����
			//num�� i�� �������� �� �������� 0�� ���� => i�� num�� ���
			if(num % i == 0){
				cnt++;//cnt +=1;// cn = cnt +1;
			}
		}
		//����� ������ 2���̸� �Ҽ���� ���
		if(cnt == 2){
			System.out.println(num + "�� �Ҽ�");
		}
		//2���� �ƴϸ� �Ҽ��� �ƴ��̶�� ���
		else{
			System.out.println(num + "�� �Ҽ��� �ƴ�");
		}		
		scan.close();
	}
	
}
