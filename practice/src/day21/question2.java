package day21;

public class question2 {

	public static void main(String[] args) {
		/*2. 1~6을 배열에 저장하는 코드를 작성하세요.*/
		int[] arr = new int[6];		
		for(int i = 0;i<arr.length;i++){
			arr[i] = i+1;			
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");			
		}
	}

}
