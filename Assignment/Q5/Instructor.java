package ID_27842.q5;

public class Instructor extends Course {
	private String instructorName;
	private String email;
	private int phone;
	public Instructor(int iD, String createdDate, String updatedDate, String institutionName, String code, String address,
			String departmentName, String departmentHead, String courseName, int courseCode, int credits,
			String instructorName, String email, int phone) {
		super(iD, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName,
				courseCode, credits);
		this.instructorName = instructorName;
		this.email = email;
		this.phone = phone;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println(" Invalid format");
            this.email = "N/A";
        } else {
            this.email = email;
        }
    }
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		String phoneStr = String.valueOf(phone);
		if (phoneStr.length() != 10) {
            System.out.println("⚠️ Validation FAILED for Phone: Must be 10 digits. Setting to 0.");
            this.phone = 0;
        } else {
            this.phone = phone;
        }
    }
}
