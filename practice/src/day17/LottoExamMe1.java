package day17;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.LinkedHashSet;





public class LottoExamMe1 {
	public static void main(String[] args) {
	//로또 관리 프로그램을 작성하세요
		Set set = new HashSet();

		int [][] board = new int[7][2];
		
		for(int i = 0; set.size() < 7 ; i++){
			int num = (int)(Math.random()*45) + 1 ;
			set.add(new Integer(num));			
		}		
		
		List list = new LinkedList(set);
		Collections.sort(list);		
		
		System.out.println(list);
	}
}
