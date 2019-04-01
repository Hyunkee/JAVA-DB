package day5;

public class ArrayExam2 {
	public static void main(String[] args){
		/* 7개의 정수형 배열을 생성하고 0번지에는 0, 1번지에는 1...
		 * 6번지에는 6을 넣는 코드를 작성하세요*/
		int [] arr;
		arr = new int[7]; // int [] kor = new in[10];
		arr[0] = 0;		
		// System.out.println(kor[10]); //예외 발생
		int i;
		for(i=0; i<arr.length; i++){
			arr[i] = i ;
			System.out.println(i+"번지 : " + arr[i]);
		}
	}
}
