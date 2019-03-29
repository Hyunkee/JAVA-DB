package day3;

public class exam5 {
	public static void main(String[] args) {
		/*두 수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소 공배수는 두 수의 공배수 중 가장 작은 공배수
		 * 공배수는 두 수의 배수 중 공통으로 포함한 배수
		 * 10의 배수 : 10 20 30 40 50 60 ...
		 * 15의 배수 : 15 30 45 60 75 90 ...
		 * 10과 15의 공배수 : 30 60 90 120
		 * 10과 15의 최소 공배수 : 30*/
		int i, lcm = 1;
		int num = 10;
		int num2 = 15;		
		// 반복횟수 : i는 1부터 num1*num2까지 하나씩 증가
		// 실행문 i가 num1배수이고 i가 num2의 배수이면 lcm에 i를 저장하고 반복문을 빠져나온다
		// 반복문이 종료된 후 lcm을 출력한다.
		for(i=1;i<=num*num2; i++){
			if(i % num == 0  &&  i % num2 == 0){
				lcm = i;
				break;
			}			
		}
		/* int tmp;
		 * if(num2 > num){
		 * 	//두수를 바꾼다
		 * 		tmp = num;
		 * 		num = num2;
		 *  	num2 = tmp;
		 * }
		 * for(i=num;i<=num*num2; i+=num){
				if(i % num == 0  &&  i % num2 == 0){
					  lcm = i;
					  break;
				   }			
			   }*///반복횟수를 효율적으로 줄여서 하는 방법
		System.out.println(num+"과"+num2+"의 최소 공배수 : "+ lcm);
	}
}
