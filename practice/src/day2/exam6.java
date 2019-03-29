package day2;

import java.util.Scanner;

public class exam6 {
	public static void main(String[] args) {
		/*점수가 주어지면 점수에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90점이상 ~ 100점이하 : A
		 * 80점이상 ~ 90점미만 : B
		 * 70점이상 ~ 80점미만 ...
		 * 그외 점수는 잘못된 점수입니다로 출력.*/
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
			System.out.println("잘못된 점수입니다.");
		}
		scan.close();
	}
}
