package day10;

public class Triangleme extends Shape{	
	private int area;
	private int base;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getArea(){
		return area;
	}

	public Triangleme(int x, int y, int w, int h){
		super(x,y,w,h);
		area = w*h*1/2;				
	}
	public Triangleme() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(){		
		System.out.println("세로 :" + height);
		System.out.println("밑변 :" + base);
		System.out.println("넓이 :" + area);
	}
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
		area = width * height;
	}
}
