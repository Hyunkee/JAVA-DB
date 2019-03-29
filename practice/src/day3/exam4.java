package day3;

public class exam4 {
	public static void main(String[] args) {
		/*두 수가 서로소인지 판별하세요.
		 * 서로소란 두 수의 최대 공약수가 1인 두 수 사이의 관계를 말함
		 * 3과 7은 서로소 관계
		 * 4와 6은 서로소 관계가 아님*/
		int i, gcd = 1;
		int num = 3;
		int num2 = 7;
		/* i가 num1과 num2의 공약수이면 */
		for(i=1;i<=num2; i++){
			if(num % i == 0 && num2 % i == 0){				
				gcd = i;				
			}			
		}
		if(gcd==1){
			System.out.println(num+"과" + num2 + "는 서로소 관계");
		}else{
			System.out.println(num+"과" + num2 + "는 서로소 관계가 아님");
		}
		
	}
}
