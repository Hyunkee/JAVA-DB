package day21;

public class question5 {

	public static void main(String[] args) {
		/*5.point 클래스를 이용하여 3차원의 좌표평면을 나타내는 Point3D 클래스를 생성하시오.*/
		Point3d p = new Point3d();
		p.print();
		p.move(5,5,5);
		p.print();
		p.move(10,10);
		p.print();
		p.move(5, 0);
		p.print();
		p.move(5, 0, 5);
		p.print();
	}

}
