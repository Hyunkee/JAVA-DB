package day2;

public class exam5 {
	public static void main(String[] args) {
		/* num�� 2�� ����̸� 2�� ������ ����ϰ�
		 * num�� 3�� ����̸� 3�� ������ ����ϰ�
		 * num�� 6�� ����̸� 6�� ������ ����ϰ�
		 * num�� 2,3,6�� ����� �ƴϸ� 2,3,6�� ����� �ƴմϴٶ��  ����ϴ� ����*/
		/* num = 6 => 6�� ����Դϴٸ� ����ؾ� �Ѵ�
		 * ������ ���� : ���ǹ����� ������ �߿��ϴٴ� �� Ȯ��*/
		/* ū ���� �ϼ��� �պκп� ���� �Ѵ�*/
		int num = 17;
		if(num % 6 == 0){
			System.out.println(num + "�� 6�� ���");
		}else if(num % 3 == 0){
			System.out.println(num + "�� 3�� ���");			
		}else if(num % 2 == 0){
			System.out.println(num + "�� 2�� ���");
		}else{
			System.out.println(num + "�� 2,3,6�� ����� �ƴմϴ�");
		}
	}
}
