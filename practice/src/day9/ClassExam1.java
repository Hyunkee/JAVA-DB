package day9;
// 다른 패키지에 있는 public 클래스를 사용하려면
// import 패키지.클래스명;
// 을 선언해야 해당 클래스를 사용할 수 있다.
import java.util.Scanner;

public class ClassExam1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//nextInt()는 Scanner클래스의 멤버 메소드
		//int num = scan.nextInt();
		//next()는 Scanner클래스의 멤버 메소드
		//charAt()는 String클래스의 멤버 메소드
		//char ch = scan.next().charAt(0);
		int num1;
		num1=10;
		scan.close();
		Tv tv = new Tv();
		tv.printChannel();
		Tv tv2 = new Tv();
		tv2.printChannel();
		tv.channelUp();
		tv.printChannel();
		tv2.channelUp();
		tv2.printChannel();
		Tv tv3 = tv;
		System.out.println(Tv.BRAND);		
	}
}
//같은 패키지에서 동일한 클래스명을 가지는 클래스를 선언할 수 없다.
/*class Tv{
	
}*/
