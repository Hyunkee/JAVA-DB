package day18;

public class GenericsExam2 {

	public static void main(String[] args) {
		FruitBox<Fruit> fbox1 = new FruitBox<>();
		//FruitBox<String> fbox2 = new FruitBox<>(); // 에러
	}

}

// 과일클래스
class Fruit implements Eat{}



// 과일 클래스를 상속받은 사과 클래스
class Apple extends Fruit{}

// 과일 박스 지네릭 클래스
// Eat 인터페이스를 구현하고 Fruit 클래스를 상속받은 클래스면
// 타입변수 T로 올수 있다.
class FruitBox<T extends Fruit & Eat>{}

interface Eat{}
