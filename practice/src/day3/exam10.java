package day3;

public class exam10 {
	public static void main(String[] args) {
		//      *        1
		//     ***		 3
		//    *****		 5
		//   *******	 7
		//  *********	 9
		// ***********	 11   모양만들기
		int i, num;		
		for(i=1;i<=6;i++){
			for(num=5;num>=i;num--){
				System.out.print(" ");
			}
			for(num=1;num<=(i+i)-1;num++){  //2*i-1
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
