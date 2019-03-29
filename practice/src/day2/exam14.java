package day2;

import java.util.Scanner;

public class exam14 {
	public static void main(String[] args) {
		/*정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는
		코드를 반복문을 이용하여 작성하세요.
		
		소수 : 약수가 1과 자기자신인 수
		약수 : 자신보다 작거나 같은 수 중에서 나누어 나머지가 0인 수
		4의 약수 : 1, 2, 4*/
		int num, i, cnt;
		//num : 입력받은 정수 cnt : 약수의 갯수 i : 반복문에서 사용할 변수
		Scanner scan = new Scanner(System.in);		
		num = scan.nextInt();		
		//반복횟수 : i는 1부터 num보다 작거나 같을 때까지 1씩 증가한다
		for(i=1,cnt=0; i<=num; i++){
			//i가 num의 약수이면 약수의 갯수를 하나 증가
			//num를 i로 나누었을 때 나머지가 0과 같다 => i가 num의 약수
			if(num % i == 0){
				cnt++;//cnt +=1;// cn = cnt +1;
			}
		}
		//약수의 갯수가 2개이면 소수라고 출력
		if(cnt == 2){
			System.out.println(num + "는 소수");
		}
		//2개가 아니면 소수가 아님이라고 출력
		else{
			System.out.println(num + "는 소수가 아님");
		}		
		scan.close();
	}
	
}
