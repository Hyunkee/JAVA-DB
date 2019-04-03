package day7;

import java.util.Scanner;

public class exam4 {
	public static void main(String[] args){
		/* 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드를 작성하세요.*/
		// 방법1
		Scanner scan = new Scanner(System.in);		
		int [] arr = new int[3];		
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		arr[0] = num;
		arr[1] = num2;
		arr[2] = num3;
		for(int tmp : arr)
			System.out.print(tmp + " ");
		System.out.println();
		
		
		//방법2		
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		for(int tmp : arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		
		//방법3
		scan.close();
		for(int i = 0; i<arr.length; i++)
			arr[i] = scan.nextInt();
		for(int tmp : arr)
			System.out.println(tmp + " ");
		System.out.println();
		scan.close();
	}
}
