package day3;

public class exam5 {
	public static void main(String[] args) {
		/*�� ���� �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ּ� ������� �� ���� ����� �� ���� ���� �����
		 * ������� �� ���� ��� �� �������� ������ ���
		 * 10�� ��� : 10 20 30 40 50 60 ...
		 * 15�� ��� : 15 30 45 60 75 90 ...
		 * 10�� 15�� ����� : 30 60 90 120
		 * 10�� 15�� �ּ� ����� : 30*/
		int i, lcm = 1;
		int num = 10;
		int num2 = 15;		
		// �ݺ�Ƚ�� : i�� 1���� num1*num2���� �ϳ��� ����
		// ���๮ i�� num1����̰� i�� num2�� ����̸� lcm�� i�� �����ϰ� �ݺ����� �������´�
		// �ݺ����� ����� �� lcm�� ����Ѵ�.
		for(i=1;i<=num*num2; i++){
			if(i % num == 0  &&  i % num2 == 0){
				lcm = i;
				break;
			}			
		}
		/* int tmp;
		 * if(num2 > num){
		 * 	//�μ��� �ٲ۴�
		 * 		tmp = num;
		 * 		num = num2;
		 *  	num2 = tmp;
		 * }
		 * for(i=num;i<=num*num2; i+=num){
				if(i % num == 0  &&  i % num2 == 0){
					  lcm = i;
					  break;
				   }			
			   }*///�ݺ�Ƚ���� ȿ�������� �ٿ��� �ϴ� ���
		System.out.println(num+"��"+num2+"�� �ּ� ����� : "+ lcm);
	}
}
