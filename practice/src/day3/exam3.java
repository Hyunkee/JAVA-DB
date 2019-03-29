package day3;

public class exam3 {
	public static void main(String[] args) {
		/*두 수의 최대 공약수를 구하는 코드를 작성하세요.
		   최대 공약수 : 두수의 공약수 중 가장 큰 공약수 
		   공약수 : 두수의 약수중에서 공통으로 들어가있는 약수*/
		int i, gcd = 1;
		int num = 8;
		int num2 = 12;
		/* i가 num1과 num2의 공약수이면 */
		for(i=1;i<=num2; i++){
			if(num % i == 0 && num2 % i == 0){
				/*i가 num1의 약수이고 i가 num2의 약수이면 gcd에 i를 저장한다.
				 * 반복문이 종료된 후 gcd를 출력한다.*/
				gcd = i;				
			}			
		}		
		System.out.println(num+"과"+num2+"의 최대 공약수 : "+ gcd);		
	}
}