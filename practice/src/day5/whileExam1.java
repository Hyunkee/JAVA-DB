package day5;

public class whileExam1 {
	public static void main(String[] args) {
		/*
		 * for(1.초기화; 2.5.8조건식; 4.7.증감연산){
		 * 		3.6.9실행문;
		 * }
		 * 
		 * 1.초기화;
		 * while(2.5.8조건식){
		 * 		3.6.9실행문;
		 * 		4.7.10증감연산;
		 * }  
		 */
		/*
		 * 무한루프
		 * for( ; ; ){
		 * 		실행문;
		 * }
		 * while(true){
		 *  	실행문;
		 * }
		 */
		// 1부터 10까지의 합
		int i, sum;
		for(i=1,sum=0;i<=10; i++){
			sum += i;
		}
		System.out.println(sum);
		  
		 //  = 
		
		while(i<=10){
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
