package ID_27842.q5;

public class Course extends Department {
	private String courseName;
	private int courseCode;
	private int credits;
	public Course(int iD, String createdDate, String updatedDate, String institutionName, String code, String address,
			String departmentName, String departmentHead, String courseName, int courseCode, int credits) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead);
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.credits = credits;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		if (credits <= 0) {
            System.out.println(" Must be > 0");
            this.credits = 1;
        } else {
            this.credits = credits;
        }
    }
	
	
}
