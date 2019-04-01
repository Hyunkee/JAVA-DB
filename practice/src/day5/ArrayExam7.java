package day5;

public class ArrayExam7 {
	public static void main(String[] args){
		// A~Z, a~z, 0~9로 조합된 8자리의 임시 비밀번호 발급하는 예제
		// A~Z : 26개, a~z : 26개, 0~9 : 10개
		// 62개, 0~61
		// 0~9 : '0'~'9' // 배열은 같은 타입의 변수가 와야하기 때문에 문자열로 바꾼다.
		// 10~35 : 'a'~'z'
		// 36~61 : 'A'~'Z'
		// 랜덤한 수가 60 : 'Y' 대문자 Y
		char []pw = new char[8];
		for(int i=0; i<pw.length; i++){
			int r= (int)(Math.random()*62);
			if(r<=9){
				// 문자  + 정수 = 정수
				// 문자 = 정수;         //(불가능)
				// 문자 = (char)정수;   //(가능)
				pw[i] = (char)('0'+r);
			}else if(r<=35){
				pw[i] = (char)('a'+(r-10));
			}else{
				pw[i] = (char)('A'+(r-36));
			}
		}
		System.out.println(pw);		
	}
}
