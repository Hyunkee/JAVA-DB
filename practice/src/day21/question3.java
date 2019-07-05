package day21;

public class question3 {

	public static void main(String[] args) {
		/*3. 1번에서 작성한 코드를 이용하여 min, max가 주어지면 min-max까지의합을 구하는 
    		  코드를 함수로 작성하세요.*/
		
		int res;
		int min = 10;
		int max = 1;
		res = sum(min,max);
		System.out.println(max);
		System.out.println(res);
	}
	/* 기능 : min과 max가 주어지면 min부터 max까지의 합을 알려주는 메소드
	 * 매개변수 : min, max
	 * 리턴타입 : int
	 * 메소드명 : sum 
	 * */
	public static int sum(int min, int max){
		int res;
		int i;
		if(max < min){
			int tmp = min;
			min = max;
			max = tmp;
		}
		for(res=0,i=min;i<=max;i++){
			res = res + i;
			//sum += i;
		}
		return res;
		
	}
}


