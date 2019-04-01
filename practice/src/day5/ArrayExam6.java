package day5;

public class ArrayExam6 {
	public static void main(String[] args){		
		// 1.랜덤한 수를 생성
		// 2.생성된 수가 배열에 있는지 없는지 검색
		// 3.없으면 생성된 수를 배열에 저장, i를 증가
		// 4.있으면 아무일도 하지 않는다.		
		int [] arr;
		arr = new int[7]; 
		arr[0] = 0;		 
		int i;
		for(i=0; i<arr.length; ){
			int r = (int)(Math.random()*(7-1+1)) + 1 ;			
			boolean find = false; 
			for(int j=0; j<arr.length; j++){
				if(arr[j] == r){ 
					find = true;
					break;
				}			
			}
			if(!find){ //find == false
				arr[i] = r;
				i++;
			}
		}
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
	}
}
