package day18;

public class EnumExam2 {
		public static void main(String[] args){
			for(Kind k : Kind.values()){
				System.out.println(k.name() + " = " + k.getValue());
		}
		Number num = Number.ONE;
		num = Number.FIVE;
		System.out.println(num);
		Human h = new Human();
		h.gender2 = Gender2.MALE;
		System.out.println(h.gender2);
	}
}

class Human{
	Gender2 gender2;
}

enum Gender2{ MALE, FEMALE }

enum Kind{//열거형 클래스
	SPACE(1), CLOVER(2), HEART(3), DIA(4);
	private final int value;
	Kind(int value) { this.value = value;}
	public int getValue(){return value;}	
}

enum Number{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K}