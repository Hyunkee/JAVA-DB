package day14;

public class UniversityStudent extends Person {
	//멤버 변수
	private String id;		// 학번
	private String state;   // 학생 상태 : 재학, 수료, 졸업, 휴학, 재적
	private double averageScore;  // 학점
	private int semester;   // 학기
	private String major;   // 전공
	private String universityName; // 학교
	private String advisor; // 지도교수	
	
	//getters와 setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		if(averageScore >= 0)
			this.averageScore = averageScore;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		if(semester > 0)
			this.semester = semester;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public UniversityStudent(){
		super();
		setSemester(1);
		setAverageScore(0.0);
		id=""; advisor="";state="";universityName="";
		major="";
	}
	public UniversityStudent(UniversityStudent s){
		super((Person)s);
		setSemester(s.semester);
		setAverageScore(s.averageScore);
		id=s.id; advisor=s.advisor; state=s.state; 
		universityName=s.universityName; major=s.major;
	}
	public UniversityStudent(String name, String address, String nationality, String gender, 
			String birthDay, int age, int semester, double averageScore, String id, 
			String advisor, String state, String universityName, String major){
		super(name, address, nationality, gender, birthDay, age);
		setSemester(semester);
		setAverageScore(averageScore);
		this.id=id; this.advisor=advisor; this.state=state; 
		this.universityName=universityName; this.major=major;
	}
	
	
}
