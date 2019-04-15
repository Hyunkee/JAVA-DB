package day15;

public class Rect2 {
	// 사각형 클래스를 만들고 테스트 해보세요
	// 가로, 세로, 넓이
	
	private int width;
	private int height;
	private int area;
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getArea() {
		return area;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	public Rect2(int width, int height){
		area = width*height;
		this.width = width; this.height = height;
	}
	public void print(){
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + area);
	}
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
		area = width * height;
	}
	
}
