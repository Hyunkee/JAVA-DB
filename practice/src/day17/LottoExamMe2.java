package day17;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class LottoExamMe2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int [][] board = new int[2][7];
		
		for(int i=0; set.size() < 25; i++){
			set.add((int)(Math.random()*45)+1+"");
		}		
		
		Iterator it = set.iterator();
		
		for(int i=0; i < board.length; i++){
			for(int j=0; j < board[i].length; j++){
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}			
			System.out.println();
		}

	}

}
