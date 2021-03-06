package day20;


import java.util.Scanner;

import day20.StdManager;

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
		// 학생 한명의 정보를 만들고
		// 학생 한명의 정보에 과목을 추가하고
		// 평점을 확인
		/*Std s = new Std("김현기", "20190422", "청주", "컴퓨터", 0.0);
		System.out.println(s);
		s.insertSubject(new Grade("A+", "세종대왕", "한글", 3));
		System.out.println(s);
		s.insertSubject(new Grade("B", "이순신", "해상학", 2));
		System.out.println(s);
		s.insertSubject(new Grade("C", "장영실", "기계학", 1));
		System.out.println(s);*/
		
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			//메뉴출력
			sMng.printMenu();
			//메뉴선택
			menu = scan.nextInt();
			Std std;
			Std result;
			int subMenu;
			switch(menu){
			case 1 : 
				Std s = sMng.inputStd(scan);
				if(sMng.insert(s))
					System.out.println("학생정보를 추가 했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2 : 
				/* 기능 : 학생 정보를 입력받고 학생정보를 추가
				 * 변경 : 2번 선택시 학생 정보 수정 또는 과목 등록을 할 수 있게 한다.				 * 
				 * */
				// 1. 메뉴 출력
				System.out.println("2-1. 학생정보 수정");
				System.out.println("2-2. 학생 수강과목 등록");
				System.out.println("서브 메뉴를 선택하세요(1 or 2) : ");
				
				// 2. 메뉴 선택
				subMenu = scan.nextInt();
				
				// 3. 선택된 메뉴에 따라 해당 기능 동작
				if(subMenu ==1){
					Std s2 = sMng.inputStd(scan);
					if(sMng.update(s2))
						System.out.println("학생정보를 수정 했습니다.");
					else
						System.out.println("없는 학번입니다.");
					
				}else if(subMenu == 2){
					//과목 추가하는 기능 작성
					//검색할 학생 정보 입력 후 해당 학생 정보로 검색하여
					//==>기존 메소드로 구현 가능
					std = sMng.inputId(scan);
					result = sMng.search(std);
					
					//해당 학생정보가없으면 해당 기능 종료
					if(result == null){
						System.out.println("없는 학번입니다.");
						break;
					}
					//추가할 과목 정보를 입력하여 입력받은 과목을 통해 과목 객체 생성 
					//==> 새로운 메소드 구현(StdManager.inputId와 비슷)
					Grade grade = sMng.inputSubject(scan);
					//학생 객체에 과목 객체 추가 (Std.insertSbuject() 이용)
					result.insertSubject(grade);
					//매니저에 학생정보 수정(StdManager.update()이용)
					sMng.update(result);
				}
				break;
			case 3 : 
				Std s3 = sMng.inputId(scan);
				if(sMng.delete(s3))
					System.out.println("해당 학생 정보를 삭제 했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;
			case 4 : 
				// 서브메뉴 출력
				// 1. 전체 학생 출력
				// 2. 학생 수강 과목 출력
				System.out.println("4-1.학생정보 전체 출력");
				System.out.println("4-2.학생 수강 과목 전체 출력");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				// 서브메뉴 선택 => 서브메뉴 입력
				subMenu = scan.nextInt();
				// 조건문을 서브메뉴가 1이면
				// 전체 학생 출력
				// 서브메뉴가 2이면
				// 학생정보 입력을 받아 객체로 만들고 
				// =>stdManager.inputId()
				// 만들어진 객체와 일치하는 학생의 정보를 가져온다.=>stdManager.search()
				// 해당 학생 객체의 수강 과목을 출력하고 =>std.printSubject()메소드 추가
				// 없으면 아무것도 안함
				if(subMenu == 1)	sMng.print();
				else if(subMenu == 2){
					std = sMng.inputId(scan);
					result = sMng.search(std);
					if(result == null){
						System.out.println("해당 학번 학생이 없습니다.");
					}else if(!result.printSubjects()){
						System.out.println("수강한 강의가 없습니다.");
					}
				}
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










