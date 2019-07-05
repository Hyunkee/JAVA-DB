package day21;

public class Point3d extends Point {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public Point3d(){
		
	}
	public Point3d(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	public Point3d(Point3d p){
		//x와 y는 부모의 멤버 변수를 상속 받았고, 접근제한자가 private이기 때문에
		//직접 접근할수 없다. 따라서 getter를 이용하여 접근한다.
		move(p.getX(),p.getY(), p.z );
	}
	//메소드 오버로딩
	public void move(int x, int y, int z){
		move(x,y); // point 클래스에 있는 move 메소드 호출
		this.z = z;
	}
	//메소드 오버라이딩
	public void print(){
		/*super.print();
		System.out.print(z);*/
		System.out.println("("+getX()+","+getY()+","+z+")");
	}
}
