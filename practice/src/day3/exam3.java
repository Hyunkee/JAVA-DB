package day3;

public class exam3 {
	public static void main(String[] args) {
		/*�� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		   �ִ� ����� : �μ��� ����� �� ���� ū ����� 
		   ����� : �μ��� ����߿��� �������� ���ִ� ���*/
		int i, gcd = 1;
		int num = 8;
		int num2 = 12;
		/* i�� num1�� num2�� ������̸� */
		for(i=1;i<=num2; i++){
			if(num % i == 0 && num2 % i == 0){
				/*i�� num1�� ����̰� i�� num2�� ����̸� gcd�� i�� �����Ѵ�.
				 * �ݺ����� ����� �� gcd�� ����Ѵ�.*/
				gcd = i;				
			}			
		}		
		System.out.println(num+"��"+num2+"�� �ִ� ����� : "+ gcd);		
	}
}