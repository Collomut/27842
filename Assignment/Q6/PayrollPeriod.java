package ID_27842.q6;

public class ParyrollPeriod extends Employee {
	private String month;
	private int year;
	private String startDate;
	private String endDate;
	public ParyrollPeriod(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered, String month, int year, String startDate,
			String endDate) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
				employeeId, fullName, position, baseSalary, rssbRegistered);
		this.month = month;
		this.year = year;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 2000) {
            System.out.println(" Must be >= 2000");
            this.year = 2000;
        } else {
            this.year = year;
        }
    }
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		if (startDate == null || startDate.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.startDate = "N/A";
        } else {
            this.startDate = startDate;
        }
    }
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		if (endDate == null || endDate.trim().isEmpty()) {
            System.out.println("Cannot be empty.");
            this.endDate = "N/A";
        } else {
            this.endDate = endDate;
        }
    }
	
}
