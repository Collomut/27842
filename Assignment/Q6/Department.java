package ID_27842.q6;

public class Department extends Organisation {
	private String deptName;
	private String deptCode;
	private String managerName;
	public Department(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
		this.deptName = deptName;
		this.deptCode = deptCode;
		this.managerName = managerName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		if (deptName == null || deptName.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.deptName = "N/A";
        } else {
            this.deptName = deptName;
        }
    }
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		if (deptCode == null || deptCode.trim().length() < 3) {
            System.out.println(" Must be >= 3 chars.");
            this.deptCode = "";
        } else {
            this.deptCode = deptCode;
        }
    }
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		if (managerName == null || managerName.trim().isEmpty()) {
            System.out.println(" Cannot be empty.");
            this.managerName = "";
        } else {
            this.managerName = managerName;
        }
    }
	
}
