package day21;

public class question1 {	
	public static void main(String[] args) {		
		/*1~10까지의 합을 구하는 코드를 작성하세요.*/
		int i = 1,sum =0;
		for(i=1;i<=10;i++){
			sum = sum + i;
			//sum += i;
		}
		System.out.println(sum);
	}
}
