package ID_27842.q5;

public class Student extends Instructor {
	private String studentName;
	private int studentId;
	private int age;
	public Student(int iD, String createdDate, String updatedDate, String institutionName, String code, String address,
			String departmentName, String departmentHead, String courseName, int courseCode, int credits,
			String instructorName, String email, int phone, String studentName, int studentId, int age) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName,
				courseCode, credits, instructorName, email, phone);
		this.studentName = studentName;
		this.studentId = studentId;
		this.age = age;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age <= 0) {
            System.out.println(" Must be > 0. ");
            this.age = 1;
        } else {
            this.age = age;
        }
    }
}
