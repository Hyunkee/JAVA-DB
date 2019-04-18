package day18;

public class UniversityStudent {
	private Gender gender;
	private Major major;
	private Grade grade;
	private String name;
	private Integer id;
	private String universityName;
	double avrage;
	
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public Grade getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public double getAvrage() {
		return avrage;
	}
	public void setGender(String gender) {
		if(gender.equals(Gender.FEMALE.name()))
			this.gender = Gender.FEMALE;
		else
			this.gender = Gender.MALE;
	}
	public void setMajor(String major) {
		if(major.equals(Major.COMPUTER.name())){
			this.major = Major.COMPUTER;
		}
		else if(major.equals(Major.MECATRONICS.name())){
			this.major = Major.MECATRONICS;
		}
		else if(major.equals(Major.CHEMISTRY.name()))
			this.major = Major.CHEMISTRY;
		else 
			this.major = Major.MACHINE;
		
	}
	public void setGrade(String grade) {
		if(grade.equals(Grade.FRESHMAN.name())){
			this.grade = Grade.FRESHMAN;
		}
		else if(grade.equals(Grade.SOPHOMORE.name())){
			this.grade = Grade.SOPHOMORE;
		}
		else if(grade.equals(Grade.JUNIOR.name()))
			this.grade = Grade.JUNIOR;
		else if(grade.equals(Grade.SENIOR.name()))
			this.grade = Grade.SENIOR;
		else 
			this.grade = Grade.ETC;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAvrage(double avrage) {
		this.avrage = avrage;
	}
	
	public UniversityStudent(){
		gender = Gender.MALE;
		grade = Grade.FRESHMAN;
		major = Major.NONE;
				
		
	}
	
	public UniversityStudent(Gender gender, Major major, Grade grade, String name, Integer id, String universityName, double avrage){
		this.gender = gender;
		this.grade = grade;
		this.major = major;
		this.name = name;
		this.id = id;
		this.universityName = universityName;
		this.avrage = avrage;
	}
	
	public UniversityStudent(UniversityStudent s) {
		this(s.gender,s.major,s.grade,s.name,s.id,s.universityName,s.avrage);
	}
	@Override
	public String toString() {
		return "대학생 [성별=" + gender + ", 과=" + major + ", 학년=" + grade + ", 이름=" + name
				+ ", 학번=" + id + ", 대학=" + universityName + ", 평점=" + avrage + "]";
	}
	public void setId(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setAvrage(String next) {
		// TODO Auto-generated method stub
		
	}
	
	
}




















