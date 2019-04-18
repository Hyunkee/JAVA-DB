package day18;

import java.util.Scanner;

import day18.UniversityStudent;

public class StudentManager {
	/*학생 정보 프로그램만들기
	1. 학생 정보를 관리할 클래스만들기
	2. 따로 클래스를 만들어 기능을 만든다 
	3. 출력을 해본다
	4. 그 이후 기능 확장 ex) 성별 학과 학번
	5. 수정 삭제 구현*/ 

	private UniversityStudent std[];	
	private int count;		
	private final int MIN_STUDENT_COUNT = 300;
		
	public StudentManager(){
		std = new UniversityStudent[MIN_STUDENT_COUNT];
	}
	public StudentManager(int studentCnt){
		if(studentCnt>=MIN_STUDENT_COUNT)
			std = new UniversityStudent[studentCnt];
		else
			std = new UniversityStudent[MIN_STUDENT_COUNT];
	}
	
	public void insert(UniversityStudent s){
		
		if(search(s.getGender(),s.getMajor(),s.getGrade(),s.getName(),				
				s.getId(),s.getUniversityName(),s.getAvrage()) 
				== -1){
			std[count++] = new UniversityStudent(s);
			
		}
	}
	
	
	public void print(){
		for(int i=0; i<count ;i++){
			System.out.println(std[i]);
		}
	}
	
	private int search(Gender gender, Major major, Grade grade, String name, Integer id, String universityName, double avrage){
		for(int i=0; i<count;i++){
			if(std[i].getGender() == gender &&
				std[i].getMajor() == major &&
				std[i].getGrade() == grade &&
				std[i].getName() == name &&
				std[i].getId() == id &&
				std[i].getUniversityName() == universityName &&
				std[i].getAvrage() == avrage){
				return i;
			}
		}
		return -1;	
	}
	
	

	public void printMenu(){
		System.out.println("-------------");
		System.out.println("1. 학생정보추가");
		System.out.println("2. 학생정보수정");
		System.out.println("3. 학생정보삭제");
		System.out.println("4. 학생정보출력");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	public UniversityStudent inputSearchStudent(Scanner scan){
		UniversityStudent s = new UniversityStudent();
		System.out.print("성별 : ");
		s.setGender(scan.next());
		System.out.print("반 : ");
		s.setMajor(scan.next());
		System.out.print("학년 : ");
		s.setGrade(scan.next());
		System.out.print("이름 : ");
		s.setName(scan.next());
		System.out.print("학번 : ");
		s.setId(scan.next());
		System.out.print("대학교 : ");
		s.setUniversityName(scan.next());
		System.out.print("평점 : ");
		s.setAvrage(scan.next());
		return s;
	}
	public void modify(UniversityStudent s) {		
		
	}
	public void delete(UniversityStudent s) {		
		
	}	
}