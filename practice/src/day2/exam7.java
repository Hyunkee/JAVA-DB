package day2;

public class exam7 {
	public static void main(String[] args) {
		int num = 6;
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "는 6의배수");
		}
		if(num % 2 == 0){
			if(num % 3 == 0){
				System.out.println(num + "는 6의배수");
			}else{
				System.out.println(num + "는 2의배수");
			}
		}else if(num % 3 == 0){
			System.out.println(num + "는 3의배수");
		}else{
			System.out.println(num + "는 2,3,6의 배수가 아님");
		}
	}
}
