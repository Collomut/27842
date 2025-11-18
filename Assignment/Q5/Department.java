package ID_27842.q5;

public class Department extends Institution {
	private String departmentName;
	private String departmentHead;
	public Department(int iD, String createdDate, String updatedDate, String institutionName, String code, String address,
			String departmentName, String departmentHead) {
		super(iD, createdDate, updatedDate, institutionName, code, address);
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		if (departmentName == null || departmentName.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.departmentName = "";
        } else {
            this.departmentName = departmentName;
        }
    }
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		if (departmentHead == null || departmentHead.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.departmentHead = "";
        } else {
            this.departmentHead = departmentHead;
        }
    }
	
}
