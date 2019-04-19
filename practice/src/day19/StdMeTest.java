package day19;

import java.util.Scanner;

import day19.StdMeManager;

public class StdMeTest {

	public static void main(String[] args) {
		StdMeManager sMMng = new StdMeManager();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			//메뉴출력
			sMMng.printMenu();
			//메뉴선택
			menu = scan.nextInt();
			switch(menu){
			case 1 : 
				StdMe s = sMMng.inputStdMe(scan);
				if(sMMng.insert(s))
					System.out.println("학생정보를 추가 했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2 : 
				Std s2 = sMMng.inputStd(scan);
				if(sMMng.update(s2))
					System.out.println("학생정보를 수정 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 3 : 
				Std s3 = sMMng.inputId(scan);
				if(sMMng.delete(s3))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 4 : 
				sMMng.print();
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
