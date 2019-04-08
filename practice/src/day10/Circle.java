package day10;

public class Circle extends Shape {
	private int radious;

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}
	@Override
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("반지름 :"+radious);		
	}
	public Circle(){
		//super();
	}
	public Circle(int x, int y, int r){
		super(x,y,r,r);
		radious = r;
	}
}
