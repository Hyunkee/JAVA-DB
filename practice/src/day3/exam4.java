package day3;

public class exam4 {
	public static void main(String[] args) {
		/*�� ���� ���μ����� �Ǻ��ϼ���.
		 * ���μҶ� �� ���� �ִ� ������� 1�� �� �� ������ ���踦 ����
		 * 3�� 7�� ���μ� ����
		 * 4�� 6�� ���μ� ���谡 �ƴ�*/
		int i, gcd = 1;
		int num = 3;
		int num2 = 7;
		/* i�� num1�� num2�� ������̸� */
		for(i=1;i<=num2; i++){
			if(num % i == 0 && num2 % i == 0){				
				gcd = i;				
			}			
		}
		if(gcd==1){
			System.out.println(num+"��" + num2 + "�� ���μ� ����");
		}else{
			System.out.println(num+"��" + num2 + "�� ���μ� ���谡 �ƴ�");
		}
		
	}
}
