package day5;

public class ArrayExam3 {
	public static void main(String[] args){
		/* 7개를 저장할 수 있는 정수형 배열을 생성하고
		각번지에 1~45사이의 랜덤한 수를 생성하여 저장하는
		코드를 작성하세요.*/
		int min = 1;
		int max = 45;		
		
		
		int [] arr;
		arr = new int[7]; 
		arr[0] = 0;		 
		int i;
		for(i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*(max-min+1) + min) ;
			System.out.println(i+"번지 : " + arr[i]);
		}
	}
}
