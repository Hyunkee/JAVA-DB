package day15;

public class Exam {

	public static void main(String[] args) {
		// 사각형 클래스를 만들고 테스트 해보세요
		Rect2 r1 = new Rect2(4, 5);
		r1.print();
		r1.resize(20, 10);
		r1.print();
		Rect2 r2 = new Rect2(2, 3);
		r2.print();
		Rect r = new Rect();
		r.width = 10;
		r.height = 5;
		r.centerX = 0;
		r.centerY = 0;
		r.print();

	}

}

class Rect{
	public int width;
	public int height;
	public int centerX;
	public int centerY;
	
	public void print(){
		System.out.println("가로 : " + centerX + "," + centerY);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + width * height);
	}
	public void move(int x, int y){
		this.centerX = x;
		this.centerY = y;
	}
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
	}
}


