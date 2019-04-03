package day7;

public class exam3 {
	public static void main(String[] args){
		//50이하의 소수를 출력하는 코드를 작성하세요.
		int  num, cnt ;
		int i = 1;		
		for(i=1;i<=50;i++){
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
