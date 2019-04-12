package day11;

public class Exam1 {
	public static void main(String[] args) {
		Shape s = new Shape();
		Shape.printCount();
		s.print();
		/*Circleme c = new Circleme(5,5,5);
		c.print();*/
		Circle c2 = new Circle(5,5,5);
		c2.print();
		c2.move(3, 3);
		c2.print();
		c2.resize(10);
		c2.print();
		c2.move(4, 4);
		c2.print();
		Circle.printCount();
		// 자식클래스를 부모클래스로 변환할 때에는 자동 형변환이 가능하다.
		Shape s2 = c2;
		Shape.printCount();
		// 부모클래스를 자식클래스로 변환할 때에는 명시적 형변환을 해야한다.
		// 조건부로 가능 => 조건을 만족하지 않으면 사용할 때
		// ClassCastException이 발생할 수 있다.
		// 클래스 형변환에러로 변환은 했지만 사용할 수 없는 정보가 있어서 사용하지 못하는 경우
		//Circle c3 = (Circle)s;
		// c2.print(); // 실행시 에러발생
		Shape s3 = new Circle();
		Shape.printCount();
		Circle c4 = (Circle)s3;
		c4.print();
		Circle.printCount();
	}
	

}
