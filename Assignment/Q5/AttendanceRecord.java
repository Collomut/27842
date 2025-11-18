package ID_27842.q5;

public class AttendanceRecord extends ClassSession {
	private int StudentID;
	private int sessionID;
	private String status;
	public AttendanceRecord(int iD, String createdDate, String updatedDate, String institutionName, String code,
			String address, String departmentName, String departmentHead, String courseName, int courseCode,
			int credits, String instructorName, String email, int phone, String studentName, int studentId, int age,
			String sessionDate, String topic, int studentID2, int sessionID, String status) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName,
				courseCode, credits, instructorName, email, phone, studentName, studentId, age, sessionDate, topic);
		StudentID = studentID2;
		this.sessionID = sessionID;
		this.status = status;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getSessionID() {
		return sessionID;
	}
	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		String statusLower = status != null ? status.toLowerCase() : "";
        if (!statusLower.equals("present") && !statusLower.equals("absent")) {
            System.out.println(" Must be Present or Absent.");
            this.status = "Absent";
        } else {
            this.status = status;
        }
    }
	
}
