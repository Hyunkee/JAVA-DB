package day2;

import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		/*������ �־����� ������ �´� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * 90���̻� ~ 100������ : A
		 * 80���̻� ~ 90���̸� : B
		 * 70���̻� ~ 80���̸� ...
		 * �׿� ������ �߸��� �����Դϴٷ� ���.*/
		Scanner scan = new Scanner(System.in);
		double score = scan.nextDouble();
		if(90 <= score && score <= 100){ //=if((int)score/10 == 9 || score == 100){
			System.out.println("A");
		}else if(80 <= score && score <90){ // else if((int)score/10 == 8){
			System.out.println("B");
		}else if(70 <= score && score <80){
			System.out.println("C");
		}else if(60 <= score && score <70){
			System.out.println("D");
		}else if(0 <= score && score <60){
			System.out.println("F");
		}else{//if(score<0 || score>100)
			System.out.println("�߸��� �����Դϴ�.");
		}
		scan.close();
	}
}
