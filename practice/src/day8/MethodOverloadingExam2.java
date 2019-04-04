package day8;

public class MethodOverloadingExam2 {
	public static void main(String[] args) {
		printMultiTables();
	}
	
	public static void printMultiTable(int num){		
		for(int j=1;j<=9;j++){			 
			 System.out.println(num+"x"+j+"="+num * j + " ");
		}
	}	
	
	public static void printMultiTables(int start, int end){
		if(start>end){
			int tmp=start;
			start=end;
			end=tmp;
		}
		for(int i=start; i<=end; i++){
			printMultiTable(i);
		}
	}
	/* 기능 : 구구단 전체(2단~9단)이 출력되는 기능 */
	
	public static void printMultiTables(){		
		printMultiTables(2,9);		
	}
}
