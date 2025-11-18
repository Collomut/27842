package ID_27842.q6;

public class Employee extends  Department{
	private int employeeId;
	private String fullName;
	private String position;
	private int baseSalary;
	private boolean rssbRegistered;
	public Employee(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode,
				managerName);
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.position = position;
		this.baseSalary = baseSalary;
		this.rssbRegistered = rssbRegistered;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		if (employeeId < 1000) {
            System.out.println(" Must be >= 1000. ");
            this.employeeId = 1000;
        } else {
            this.employeeId = employeeId;
        }
    }
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0) {
            System.out.println(" Must be > 0");
            this.baseSalary = 1;
        } else {
            this.baseSalary = baseSalary;
        }
    }
	public boolean isRssbRegistered() {
		return rssbRegistered;
	}
	public void setRssbRegistered(boolean rssbRegistered) {
		this.rssbRegistered = rssbRegistered;
	}
	
}
