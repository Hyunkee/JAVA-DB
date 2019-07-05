package day21;

public class question4 {

	public static void main(String[] args) {
		/*4.Point 클래스를 생성하세요.
		 * Point 클래스는 2차원 좌표 평면의 점을  나타내는 클래스이다.
		 * 1)멤버 변수로는 x,y가 있고, 외부에서는 접근이 불가능하다.
		 * 2)생성자 - 기본생성자, 복사 생성자, 생성자 오버로딩 등...
		 * 3)getter와 setter와 생성
		 * 4)좌표 출력하는 메소드
		 * 5)좌표 이동하는 메소드*/
		Point p = new Point();
		p.print();
		p.move(5, 5);
		p.print();
		Point p2 = new Point();
		p2.print();
		p2.move(10, 5);
		p2.print();
	}
	
}
