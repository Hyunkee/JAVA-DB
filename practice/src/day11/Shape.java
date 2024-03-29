package day11;

import day10.Point;

public class Shape implements Draw {
	private Point center;
	private double width;
	private double height;	
	
	//Shape 클래스를 통해(상속도 포함) 만들어진 객체의 갯수를 저장하는 변수
	public static int count = 0;
	//클래스 멤버 변수 count의 값을 출력하는 클래스 멤버 메소드
	public static void printCount(){
		System.out.println("총 만들어진 도형 : " + count);
	}
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}
	public void setCenter(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	@Override
	public void print() {
		System.out.println("--------------------------------");
		System.out.print("중심점 : ");
		center.print();
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("--------------------------------");

	}

	@Override
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;

	}

	@Override
	public void move(int x, int y) {
		this.setCenter(x, y); 
	}
	public Shape(){
		center = new Point();
		count ++;
	}
	public Shape(Shape s){
		resize(s.width, s.height);
		this.center = new Point(s.center);
		count ++;
	}
	public Shape(int x, int y, int width, int height){
		this.center = new Point(x,y);
		resize(width, height);
		count ++;
	}

}
