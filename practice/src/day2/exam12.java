package day2;

public class exam12 {
	public static void main(String[] args) {
		/*1���� 5���� ����ϴ� �ڵ带 �ݺ����� ���� �ۼ��ϼ���
		int i = 0;		
		for(i=1; i<=5; i++){
			System.out.println(i);
		}*/
		// 1���� 10������ ��
		int i = 0;
		int sum = 0;
		for(i=1, sum=0; i<=10; i++){
			sum += i;//sum = sum + i;
		}
		System.out.println("1���� 10������ �� : " + sum );
	}
}
