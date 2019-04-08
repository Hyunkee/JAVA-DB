package day10;

public class Exam1 {

	public static void main(String[] args) {
		/*int num ;			
		System.out.println(num);*/ //num값을 초기화 하지 않아 에러발생
		
	    /*int []arr;
		arr[0] =1;*/ // 배열을 생성하지 않아 에러 발생

	}

}

class A{
	public int num = 0; // 명시적 초기화
	public static int cnt = 0;
	{
		num = 10; // 초기화 블럭
	}
	static{
		cnt = 10;
	}
}