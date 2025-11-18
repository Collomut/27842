package ID_27842.q4;

public class Department extends Organisation{
	private String deptName;
	private String deptCode;
	public Department(int iD, String createdDate, String updatedDate, String orgName, String address,
			String contactEmail, String deptName, String deptCode) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail);
		this.deptName = deptName;
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("^[a-zA-Z0-9]+$")) {
            System.out.println(" Must be >= 3 alphanumeric chars");
            this.deptCode = "N/A";
        } else {
            this.deptCode = deptCode;
        }
    }
	
}
