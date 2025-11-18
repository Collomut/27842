package ID_27842.q3;

public class Employee extends Employer {
	private String employeeName;
	private int salary;
	private String employeeTin;
	public Employee(int iD, String createdDate, String updatedDate, String authorityName, String region, String email,
			String categoryName, int rate, int code, String tin, String taxpayerName, String address, String employerName,
			String employerTin, int contact, String employeeName, int salary, String employeeTin) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName,
				address, employerName, employerTin, contact);
		this.employeeName = employeeName;
		this.salary = salary;
		this.employeeTin = employeeTin;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if (salary <= 0) {
            System.out.println(" Must be > 0");
            this.salary = 1;
        } else {
            this.salary = salary;
        }
    }
	public String getEmployeeTin() {
		return employeeTin;
	}
	public void setEmployeeTin(String employeeTin) {
		if (employeeTin == null || !employeeTin.matches("^\\d{9}$")) {
            System.out.println("⚠️ Validation FAILED for Employee TIN: Must be exactly 9 digits. Setting to '000000000'.");
            this.employeeTin = "000000000";
        } else {
            this.employeeTin = employeeTin;
        }
    }
	
}
