package day19;


import java.util.Scanner;

import day19.StdManager;

public class StdTest {
	public static void main(String[] args) {
		/* 학생프로그램 관리를 만드세요
		 * 학생 : 이름(String), 학번(String), 학과(String), 평점(double), 학교이름(String)
		 * 
		 * 매니저 : 추가, 수정, 삭제, 검색, 출력
		 * set을 이용함
		 * 
		 * 
		 * toString : 학생정보를 쉽게 관리하기위해 ( 오버라이딩이용 )
		 * equals : 오버라이딩이용
		 *
		 * */
		StdManager sMng = new StdManager();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			//메뉴출력
			sMng.printMenu();
			//메뉴선택
			menu = scan.nextInt();
			switch(menu){
			case 1 : 
				Std s = sMng.inputStd(scan);
				if(sMng.insert(s))
					System.out.println("학생정보를 추가 했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2 : 
				Std s2 = sMng.inputStd(scan);
				if(sMng.update(s2))
					System.out.println("학생정보를 수정 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 3 : 
				Std s3 = sMng.inputId(scan);
				if(sMng.delete(s3))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 4 : 
				sMng.print();
				break;
			case 5 :				
				break;
			default :
				System.out.println("---------------------");
				System.out.println("잘못된 메뉴를 선택했습니다.");
				System.out.println("---------------------");
			
			}
		}while(menu != 5); // menu가 5가 아닐때
		System.out.println("프로그램이 종료 되었습니다.");
		scan.close();
	}	
}










