package day3;

public class exam12 {
	public static void main(String[] args) {
			// ***********
			//  *********
			//   *******
			//    *****
			//     ***
			//      *    ������� �����
		
		int i, num;		
		for(i=1;i<=6;i++){
			for(num=1;num<=i;num++){
				System.out.print(" ");
			}
			for(num=11;num>=(i+i)-1;num--){
				System.out.print("*");
			}
			
		System.out.println();
		}
	}
}
