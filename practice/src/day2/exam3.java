package day2;

public class exam3 {
	public static void main(String[] args) {
		/*num�� 0�̸� 0�̶�� ����ϰ�, 1�̸� 1�̶�� ����ϰ�
		0�� 1�� �ƴϸ� 0�� 1�� �ƴմϴ� ��� ����ϴ� ����*/
		int num = 0;
		//num�� 0�̸�
		//=> num�� 0�� ���ٸ�
		if (num == 0){
			System.out.println("0�Դϴ�.");
		}else if(num == 1){
			System.out.println("1�Դϴ�.");
		}else{//if(num!=0 && num !=1
			System.out.println("0�� 1�� �ƴմϴ�.");
		}
	}
}
