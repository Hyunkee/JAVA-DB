package day3;

public class exam13 {
	public static void main(String[] args) {
		//      *        
		//     ***		 
		//    *****		 
		//   *******	 
		//  *********	 
		// ***********		
		//  *********
		//   *******
		//    *****
		//     ***
		//      *    모양으로 만들기	
		
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
		for(i=1;i<=6;i++){
			for(num=1;num<=i;num++){
				System.out.print(" ");
			}
			for(num=9;num>=(i+i)-1;num--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
