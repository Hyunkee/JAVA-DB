package day18;


import day18.UniStudent.Gender;

public class UniverStudentMe {

	public static void main(String[] args) {
		/*대학생 클래스 생성하고
		멤버로 학년에는 열거형으로 학년을 설정한다.(1~5학년)
		성별도 열거형으로 설정(남성,여성)
		과도 열거형으로
		학번, 평점
		학교이름은 자유롭게*/
		UniStudent s = new UniStudent();
		System.out.println(s.collegianYear);
		s.gender = Gender.MALE;
		System.out.println(s.gender);

	}

}
class UniStudent{
	Gender gender;
	
	public enum CollegianYear{
		FRESHMAN(1), SOPHOMORE(2), JUNIOR(3), SENIOR(4), ETC(5);
		private final int value;
		CollegianYear(int value) { this.value = value;}
		public int getValue(){return value;}
	}
	public enum Gender{ MALE, FEMALE }
	
	public enum major{ COMPUTER, MECA, MACHINE, CHEMISTRY }
	
	CollegianYear collegianYear = CollegianYear.FRESHMAN;
}

 