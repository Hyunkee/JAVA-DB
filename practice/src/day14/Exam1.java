package day14;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam1 {

	public static void main(String[] args) {
		System.out.println(1.0/0.0);
		try {
			System.out.println(calc(1.0,0.0,'?'));
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
		/*int num = 0;
		try{
			num = 1/0;
		}catch(ArithmeticException e){
			System.out.println("계산 관련 예외가 발생했습니다.");
			e.printStackTrace();
		}catch(Exception e){ // 앞으로 이동 할수 없다. 꼭 맨 뒤에 와야함.(exception)			
			e.printStackTrace(); // 에러 내용도 함께 확인 가능하다.
		}
		
		System.out.println(num);  // ArithmeticException 에러	 */
	}
	public static double calc(double num1, double num2, char op) 
			throws Exception, ArithmeticException{
		double res = 0.0;
		if((op == '/' || op =='%') && num2 == 0.0) 
			throw new ArithmeticException("0으로 나눌 수 없습니다."); 
		switch(op){
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		default :
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}
}
