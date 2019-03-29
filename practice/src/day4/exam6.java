package day4;

public class exam6 {
	public static void main(String[] args) {
		//100이하의 소수를 모두 출력하는 코드를 작성하세요.
		int  num, cnt ;
		int i = 1;		
		for(i=1;i<=100;i++){
			for(num=1,cnt=0;num<=i;num++){
				if( i % num == 0){
					cnt++;					
				}				
			}
			if(cnt == 2){
				System.out.print(i+" ");
			}
		}
	}
}
