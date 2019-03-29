package day4;

public class exam3 {
	public static void main(String[] args) {
		// 1부터 100까지 짝수를 출력하세요.
		int  i;		
		/*for(i=1;i<=100;i++){
			if( i % 2 == 0){
				System.out.println(i);
			} 
		}*/ // 방법1
		/*for(i=2; i<=100; i+=2){
			System.out.println(i);
		}	*/ // 방법2
		for(i=1; i<=100; i++){
			if(i%2==1){
				continue;
			}
			System.out.println(i);
		} // 방법3
		/*for(i=1; i<=50; i++){
			System.out.println(i*2);
		}*/ //방법4
	}
}
