package day7;

public class exam2 {
	public static void main(String[] args){
		/* 5개 짜리 배열을 생성하고 배열 0번지에 5, 1번지에 4, 2번지에 3, 3번지에 2, 
		 * 4번지에 1을 저장하고 출력하는 코드를 작성하세요*/
		int [] kor;
		kor = new int[5];
		kor[0] = 5;
		kor[1] = 4;
		kor[2] = 3;
		kor[3] = 2;
		kor[4] = 1;
		int i;
		for(i=0; i<kor.length; i++){			
			System.out.println(i+"번지 : " + kor[i]);
		}
		
		int []arr3 = new int[5];
		for(int j=0;j<arr3.length;j++){
			arr3[j] = arr3.length - j;			
		}
		for(int tmp:arr3)
			System.out.print(tmp + " ");
		System.out.println();
	}
}
