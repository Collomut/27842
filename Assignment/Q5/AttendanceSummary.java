package ID_27842.q5;
import java.util.Scanner;
public class AttendanceSummary extends LeaveRequest{
	private String reportDate;
	private int totalPresent;
	private int totalAbsent;
	private int totalsessions;
	public AttendanceSummary(int iD, String createdDate, String updatedDate, String institutionName, String code,
			String address, String departmentName, String departmentHead, String courseName, int courseCode,
			int credits, String instructorName, String email, int phone, String studentName, int studentId, int age,
			String sessionDate, String topic, int studentID2, int sessionID, String status, String requestDate,
			String reason, String approved, String reportDate, int totalPresent, int totalAbsent) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName,
				courseCode, credits, instructorName, email, phone, studentName, studentId, age, sessionDate, topic,
				studentID2, sessionID, status, requestDate, reason, approved);
		this.reportDate = reportDate;
		this.totalPresent = totalPresent;
		this.totalAbsent = totalAbsent;
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public int getTotalPresent() {
		return totalPresent;
	}
	public void setTotalPresent(int totalPresent) {
		this.totalPresent = totalPresent;
	}
	public int getTotalAbsent() {
		return totalAbsent;
	}
	public void setTotalAbsent(int totalAbsent) {
		this.totalAbsent = totalAbsent;
	}
	public void setTotalSessions(int tSessions) { 
        // Simple check to prevent division by zero in generateSummary()
        if (tSessions <= 0) {
            System.out.println("⚠️ Validation FAILED for Total Sessions: Must be > 0. Setting to 1.");
            this.totalsessions = 1; 
        } else {
            this.totalsessions = tSessions; 
        }
    }
	public double generateSummary() {
        
        double totalPresentD = this.totalPresent;
        double totalSessionsD = this.totalsessions;
        
        
        double attendancePercentage = (totalSessionsD > 0) ? (totalPresentD / totalSessionsD) * 100 : 0.0;

        System.out.println("\n================ ATTENDANCE SUMMARY ================");
        System.out.println("Student: " + getStudentName() + " (" + getStudentID() + ")"+"27842");
        System.out.println("Course: " + getCourseName()+"27842");
        System.out.println("Total Sessions: " + totalsessions+"27842");
        System.out.println("Total Present: " + totalPresent+"27842");
        
        System.out.printf("ATTENDANCE PERCENTAGE: %.2f%%\n", attendancePercentage+"27842");
        
        return attendancePercentage;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iD = 0;
        String createdDate = null;
        String updatedDate = null;
        String institutionName = null;
        String code = null;
        String address = null;
        String departmentName = null;
        String departmentHead = null;
        String courseName = null;
        int courseCode = 0;
        int credits = 0;
        String instructorName = null;
        String email = null;
        int phone = 0;
        String studentName = null;
        int studentId = 0;
        int age = 0;
        String sessionDate = null;
        String topic = null;
        int studentID2 = 0;
        int sessionID = 0;
        String status = null;
        String requestDate = null;
        String reason = null;
        String approved = null;
        String reportDate = null;
        int totalPresent = 0;
        int totalAbsent = 0;
        
        
        System.out.println("Enter ID");
        iD = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Created Date");
        createdDate = sc.nextLine();

        System.out.println("Enter Updated Date");
        updatedDate = sc.nextLine();

        
        System.out.println("Enter Institution Name");
        institutionName = sc.nextLine();

        System.out.println("Enter Institution Code");
        code = sc.nextLine();
        sc.nextLine(); 

        System.out.println("Enter Address");
        address = sc.nextLine();

        System.out.println("Enter Department Name");
        departmentName = sc.nextLine();

        System.out.println("Enter Department Head");
        departmentHead = sc.nextLine();

        System.out.println("Enter Course Name");
        courseName = sc.nextLine();

        System.out.println("Enter Course Code");
        courseCode = sc.nextInt();

        System.out.println("Enter Credits");
        credits = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Instructor Name");
        instructorName = sc.nextLine();

        System.out.println("Enter Email");
        email = sc.nextLine();

        System.out.println("Enter Phone");
        phone = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Student Name");
        studentName = sc.nextLine();

        System.out.println("Enter Student ID");
        studentId = sc.nextInt();

        System.out.println("Enter Age");
        age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Session Date");
        sessionDate = sc.nextLine();

        System.out.println("Enter Topic");
        topic = sc.nextLine();

        System.out.println("Enter Student ID ");
        studentID2 = sc.nextInt();

        System.out.println("Enter Session ID");
        sessionID = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Status");
        status = sc.nextLine();

        System.out.println("Enter Request Date");
        requestDate = sc.nextLine();

        System.out.println("Enter Reason");
        reason = sc.nextLine();

        System.out.println("Enter Approved (Yes/No)");
        approved = sc.nextLine();

        System.out.println("Enter Report Date");
        reportDate = sc.nextLine();

        System.out.println("Enter Total Present");
        totalPresent = sc.nextInt();

        System.out.println("Enter Total Absent");
        totalAbsent = sc.nextInt();

       
        AttendanceSummary as = new AttendanceSummary( iD, createdDate, updatedDate,institutionName, code, address,departmentName, departmentHead,courseName, courseCode, credits,instructorName, email, phone,
            studentName, studentId, age,sessionDate, topic,studentID2, sessionID, status,requestDate, reason, approved,reportDate, totalPresent, totalAbsent);

       
        
        sc.close();
    }
}
	


