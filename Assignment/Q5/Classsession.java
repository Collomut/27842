package ID_27842.q5;

public class ClassSession extends Student{
	private String sessionDate;
	private String topic;
	public ClassSession(int iD, String createdDate, String updatedDate, String institutionName, String code,
			String address, String departmentName, String departmentHead, String courseName, int courseCode,
			int credits, String instructorName, String email, int phone, String studentName, int studentId, int age,
			String sessionDate, String topic) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName,
				courseCode, credits, instructorName, email, phone, studentName, studentId, age);
		this.sessionDate = sessionDate;
		this.topic = topic;
	}
	public String getSessionDate() {
		return sessionDate;
	}
	public void setSessionDate(String sessionDate) {
		if (sessionDate == null || sessionDate.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.sessionDate = "";
        } else {
            this.sessionDate = sessionDate;
        }
    }
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		if (topic == null || topic.trim().isEmpty()) {
            System.out.println(" Cannot be empty. ");
            this.topic = "";
        } else {
            this.topic = topic;
        }
    }
	
}
