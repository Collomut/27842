package ID_27842.q5;

public class LeaveRequest extends AttendanceRecord{
	private String requestDate;
	private String reason;
	private String approved;
	public LeaveRequest(int iD, String createdDate, String updatedDate, String institutionName, String code,
			String address, String departmentName, String departmentHead, String courseName, int courseCode,
			int credits, String instructorName, String email, int phone, String studentName, int studentId, int age,
			String sessionDate, String topic, int studentID2, int sessionID, String status, String requestDate,
			String reason, String approved) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName,
				courseCode, credits, instructorName, email, phone, studentName, studentId, age, sessionDate, topic,
				studentID2, sessionID, status);
		this.requestDate = requestDate;
		this.reason = reason;
		this.approved = approved;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		if (reason == null || reason.trim().isEmpty()) {
            System.out.println(" Cannot be empty.");
            this.reason = "N/A";
        } else {
            this.reason = reason;
        }
    }
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	
}
