package day19;

public class StdMe {
	// 학번, 이름, 학과, 학교
	private String id=" ";
	private String name=" ";
	private String major=" ";
	private String sName=" ";
	
	
	// getter 와 setter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getsName() {
		return sName;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	// toString 생성
	@Override
	public String toString() {
		return "StdMe [학번=" + id + ", 이름=" + name + ", 학과=" + major + ", 학교=" + sName + "]";
	}
	
	// hashCode 생성
	@Override	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	// equals 생성
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StdMe other = (StdMe) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	//기본생성자
	public StdMe(){
		
	}
	//복사생성자
	public StdMe(StdMe s){
		this(s.id, s.name, s.major, s.sName);
	}
	//생성자 오버로딩
	public StdMe(String id, String name, String major, String sName){
		this.id = id;
		this.name = name;
		this.major = major;
		this.sName = sName;
	}
}
