package day5;

public class ArrayExam10 {
	public static void main(String[] args){
		// 두 수 공약수들을 배열에 저장하여 출력하는 코드를 작성하세요.
		// 공약수는 최대 10개까지 저장
		 int num=8, num2 = 12;
		 int i=1;
		 int []arr = new int[10];
		 int cnt=0; // 공약수의 갯수
		
		 for(i=1;i<=num2; i++){
			 if(cnt == 10){ // 에러방지용
					break;
				}
			if(num % i == 0 && num2 % i == 0){				
				arr[cnt]=i;
				cnt++; //공약수 갯수를 하나 증가				
			}			
		 }
		 for(int j= 0;j<arr.length;j++){
				System.out.print(arr[j] + " ");
		}
	}
}
