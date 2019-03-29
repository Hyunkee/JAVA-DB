package day2;

public class exam8 {
	public static void main(String[] args) {
		int num = 4;
		switch(num%2){
		case 0://if(num%2 == 0)
			System.out.println("짝수");
			break;
		//..
		//case 1: //default
		default:
			System.out.println("홀수");
			break;			
		}
	}
}
