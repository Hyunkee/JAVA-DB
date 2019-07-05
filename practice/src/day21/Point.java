package day21;

public class Point{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/*기본생성자*/
	public Point(){
		
	}
	
	/*복사생성자*/
	public Point(Point p){
		move(p.x,p.y);
	}
	public Point(int x,int y){
		move(x,y);
	}
	

	/* 기능 : 좌표가 정해지면 출력해주는 기능
	 * 매개변수 : 
	 * 리턴타입 : void
	 * 메소드명 : print
	 * */
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	/* 기능 : 좌표가 이동하는 기능
	 * 매개변수 : x, y
	 * 리턴타입 : void
	 * 메소드명 : move
	 * */
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
}