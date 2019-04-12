package day11;

public class Circleme extends Shape {
	private int radious;
	

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}	
	
	@Override
	public void print() {	
		System.out.println("반지름 : " + radious);	
		super.print();
			
	}
	public Circleme(int x, int y, int r){
		super(x,y,r,r);
		radious = r;
	}	
	
}
