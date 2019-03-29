package day3;

public class exam11 {
	public static void main(String[] args) {
				// ******
				// *****
				// ****
				// ***
				// **
				// *    모양으로 만들기
		
		int i, num;		
		for(i=1;i<=6;i++){			
			for(num=6;num>=i;num--){ // for(num=1;num<=7-i;num++)
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
