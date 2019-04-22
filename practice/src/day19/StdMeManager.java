package day19;

import java.util.*;

public class StdMeManager {
	// 학생정보를 추가, 수정, 삭제, 출력을 할 수 있게 여러기능들을 모아둔 클래스
	
	private HashSet<StdMe> list = new HashSet<StdMe>();
	
	//추가
	public boolean insert(StdMe s){
		StdMe tmp = new StdMe(s);
		return list.add(tmp);
	}
	
	//찾기
	public StdMe search(StdMe s){
		Iterator<StdMe> it = list.iterator();
		while(it.hasNext()){
			StdMe tmp = (StdMe)it.next(); 
			if(it.equals(s))
				return tmp;
		}		
		return null;
	}
	
	//수정
	public boolean update(StdMe s){
		if(!delete(s)){
			return false;
		}
		return insert(s);
	}
	
	//삭제
	public boolean delete(StdMe s){
		StdMe tmp = search(s);
		return list.remove(tmp);
	}
	
	//출력
	public void print(){
		Iterator<StdMe> it = list.iterator();
		while(it.hasNext()){
			StdMe tmp = (StdMe)it.next();
			System.out.println(tmp);
		}
	}
	
	//메뉴출력
	public void printMenu(){
		System.out.println("---------메뉴---------");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.종료");
		System.out.println("---------------------");
		System.out.println("메뉴를 입력해주세요 : ");
	}
	
	
	public StdMe inputId(Scanner scan){
		System.out.println("----정보를 입력하세요----");
		System.out.println("학번 : ");
		String id = scan.next().trim();
		StdMe tmp = new StdMe();
		tmp.setId(id);
		return tmp;
	}
	
	public StdMe inputStdMe(Scanner scan){
		StdMe tmp = inputId(scan);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학교이름 : ");
		String sName = scan.next();
		System.out.print("전공 : ");
		String major = scan.next();		
		System.out.println("---------------------");
		tmp.setName(name);
		tmp.setsName(sName);
		tmp.setMajor(major);		
		return tmp;
	}
}
