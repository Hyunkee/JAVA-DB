package day10;

public class InheritanceExam1 {

	public static void main(String[] args) {
		/*KiaCar kc = new KiaCar();
		kc.printCar();*/
		
		Circle c = new Circle(5,5,5);
		c.print();		
		
		Rect r = new Rect(0,0,4,5);
		r.print();
		r.resize(2, 1);
		r.print();
		
		Shape s1 = new Rect();
		Shape s2 = new Circle();
		Shape s3 = new Shape();
		if(s1 instanceof Rect){
			System.out.println("객체 s1은 Rect로 형변환이 가능");
			Rect r1 = (Rect)s1;
			r1.print();
			r1.resize(3, 1);
			r1.print();
		}
		if(s3 instanceof Rect){
			System.out.println("객체 s3은 Rect로 형변환이 가능");
		}else{
			System.out.println("객체 s3은 Rect로 형변환이 불가능");
		}				
		Shape s5 = new Triangle(0,0,10,5);
		s5.print();
	}

}
