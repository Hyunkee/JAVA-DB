package day8;

public class MethodExam3 {
	public static void main(String[] args) {
		/*int res = printMultiTable(2);*/ // 에러 예제
		/*printMultiTable(2);*/
		printMultiTables(6,4);
		
	}
	
	/* 기능 : 단(구구단)을 출력하는 기능
	 * 매개변수 : 단 => 하나의 정수 => int num
	 * 리턴타입 : void => 이기 때문에 return 을 할 필요가 없다.
	 * 메소드명 : printMultiTable
	 * */
	public static void printMultiTable(int num){		
		for(int j=1;j<=9;j++){			 
			 System.out.println(num+"x"+j+"="+num * j + " ");
		}
	}
	
	/* 기능 : 2단에서 9단을 출력하는 기능
	 * 매개변수 : num, num2
	 * 리턴타입 : void
	 * 메소드 : printMultiTables
	 */
	/*public static void printMultiTables(int num,int num2){		
		
		for(;num<=num2;num++){			
			printMultiTable(num);
		}			
	}*/
	public static void printMultiTables(int start, int end){
		if(start>end){
			int tmp=start;
			start=end;
			end=tmp;
		}
		for(int i=start; i<=end; i++){
			printMultiTable(i);
		}
	}
	/* 메소드에서 리턴값이 있을 때 구현 시 유의사항
	 * 조건문을 통해 return 하는 경우나
	 * 반복문안에서 return을 할 경우 조심해야한다
	 * 조건문을 통해 return할 경우 조건문이 거짓인 경우를 고려해야 한다.
	 * 반복문안에서 return을 할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 
	 * 고려해야 한다.*/
	/* ex)public static int test1(){ // test() 에러
		int r = 0;
		for(int i=1; i<=9; i++){
			r+= i;
			if(r > 50){
				return r;
			}
			//반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 자바 컴파일러는
			//세세한  내용까지 검사하지 않기 때문에 반복문이 종료 됐을 경우 리턴도 설정해주어야한다.
			return 0;
			// 를 넣어주면 에러가 나지 않는다.
		}
	}*/
	/* ex)public static int test(int num){ test(int num) 에러
		if(num >= 0) return 1;
		else if(num<0) return -1;
		// else return -1; 로 수정하면 에러가 나지 않는다.
	}*/
	
}	
