package practice;

import java.util.Scanner;

class exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//System.out.println(1<=num && num<=100); //방법 1
		boolean isScore = false;
		isScore = 1 <= num && num <= 100;
		System.out.println(isScore); // 방법 2
		scan.close();
		
		
	}
}
