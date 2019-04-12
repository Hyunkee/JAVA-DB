package day14;

import java.util.ArrayList;

public class Exam2 {

	public static void main(String[] args) {
		// 오토박싱 : 일반자료형 => 래퍼클래스의 객체로
		// 언박싱 : 래퍼클래스의 객체 => 일반자료형
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // 오토박싱. 10 => new Integer(10)
		
		int value = list.get(0); // 언박싱. new Integer(10) => 10
		
	}
}
