package day2;

public class exam7 {
	public static void main(String[] args) {
		int num = 6;
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "�� 6�ǹ��");
		}
		if(num % 2 == 0){
			if(num % 3 == 0){
				System.out.println(num + "�� 6�ǹ��");
			}else{
				System.out.println(num + "�� 2�ǹ��");
			}
		}else if(num % 3 == 0){
			System.out.println(num + "�� 3�ǹ��");
		}else{
			System.out.println(num + "�� 2,3,6�� ����� �ƴ�");
		}
	}
}
