package day2;

public class exam4 {
	public static void main(String[] args) {
		//num가 2의 배수이면 2의 배수라고 출력하는 예제
		//풀어쓰면 num를 2로 나누었을때 나머지가 0과 같다면 2의 배수라고 출력하는 예제
		int num = 4;
		if( num % 2 == 0){
			System.out.println(num+"는 2의 배수");
		}
	}
}
