package day9;

import day8.MethodExam1;
import day8.MethodExam3;
import day8.MethodExam4;

public class ClassExam2 {
	public static void main(String[] args){
		String []s = new String[3];
		ClassExam1.main(s);
		int res = MethodExam4.factorial(5);
		System.out.println(res);
		MethodExam3.printMultiTables(2, 9);
		int sum = MethodExam1.sum(6, 9);
		System.out.println(sum);
	}
}
