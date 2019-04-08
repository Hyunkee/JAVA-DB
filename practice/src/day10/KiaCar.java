package day10;

import day9.Car;

public class KiaCar extends Car{//extends를 이용한 상속 => day9. car.java를 상속함	
	public final static String brand = "KIA";
	public KiaCar(){
		//speed = 0; //접근 불가 => 부모에서 접근제한자가 privite이기 떄문에
		setSpeed(0);
	}
}
