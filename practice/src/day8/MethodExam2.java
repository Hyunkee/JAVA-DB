package day8;

public class MethodExam2 {
	public static void main(String[] args) {		
		System.out.println(calc(1,2,'+'));
		System.out.println(calc(1,2,'-'));
		System.out.println(calc(1,2,'*'));
		System.out.println(calc(1,2,'/'));
		System.out.println(calc(1,2,'%'));
	}
	
	
	/* 문제  기능 : 두 정수의 산술 연산 결과를 알려주는 메소드
	 * 매게변수 : 두 정수 num , num2
	 * 리턴타입 : int
	 * 메소드명 : calc
	 */ 
	/*public static int calc(int num,int num2){
		
		System.out.println(num+"+"+num2+"="+(num+num2));
		System.out.println(num+"-"+num2+"="+(num-num2));
		System.out.println(num+"x"+num2+"="+(num*num2));
		System.out.println(num+"/"+num2+"="+(num/(double)num2));
		System.out.println(num+"/"+num2+"="+(num%num2));
		
		return 0;		
	}		*/
	
	
	/* 풀이  기능 : 두 정수의 산술 연산 결과를 알려주는 메소드
	 * 매게변수 : 두 정수와 산술 연산자 =>int num1, int num2, char op
	 * 리턴타입 : 산술연산결과 => 실수 => double
	 * 메소드명 : calc
	 */
	public static double calc(int num1, int num2, char op){
		double res =0.0;
		switch(op){
		case '+' : res = num1 + num2; break;
		//case '+' : return num1 + num2;
		case '-' : res = num1 - num2; break;
		//case '+' : return num1 - num2;
		case '*' : res = num1 * num2; break;
		//case '+' : return num1 * num2;
		case '/' : res = (double)num1 / num2; break;
		//case '+' : return num1 / num2;
		case '%' : res = num1 % num2; break;
		//case '+' : return num1 % num2;
		default : res = 0.0;
		}
		return res;
	}
}
