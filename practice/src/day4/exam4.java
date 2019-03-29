package day4;

public class exam4 {
	public static void main(String[] args) {
		// 두 수의 공약수를 출력하는 코드를 작성하시오
		 int num=8, num2 = 12;
		 int i, gcd=1;
				
		/* i가 num1과 num2의 공약수이면 */
		for(i=1;i<=num2; i++){
			if(num % i == 0 && num2 % i == 0){
				gcd = i;
				System.out.println(i+" ");				
			}			
		}
		System.out.println();
		System.out.println(num+"과 " +num2+"의 최대 공약수 :" + gcd);
		
	}
}
