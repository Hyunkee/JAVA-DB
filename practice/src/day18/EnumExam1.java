package day18;

import day18.Card.Kind;

public class EnumExam1 { // 제한 적인 값을 가진 것은 열거형으로 정의 하는것이 좋다.

	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.kind);
		c.kind = Kind.CLOVER;
		//c.kind = Card.Kind.CLOVER; // import 를 지우고 이렇게도 가능함.
		System.out.println(c.kind.ordinal());
		System.out.println(c.kind.name());		
	}

}

class Card{
	public enum Kind/*자료형Kind*/ {
		SPACE(1), CLOVER(2), HEART(3), DIA(4);
		private final int value;
		Kind(int value) { this.value = value;}
		public int getValue(){return value;}
		}
	enum Value {}
	
	
	
	Kind kind = Kind.SPACE;
	
	
}
