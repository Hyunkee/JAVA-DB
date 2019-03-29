package day2;

public class exam12 {
	public static void main(String[] args) {
		/*1에서 5까지 출력하는 코드를 반복문을 통해 작성하세요
		int i = 0;		
		for(i=1; i<=5; i++){
			System.out.println(i);
		}*/
		// 1부터 10까지의 합
		int i = 0;
		int sum = 0;
		for(i=1, sum=0; i<=10; i++){
			sum += i;//sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum );
	}
}
