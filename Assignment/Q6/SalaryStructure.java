package ID_27842.q6;

public class SalaryStructure extends ParyrollPeriod{
	private int transportAllownce;
	private int housingAllowance;
	public SalaryStructure(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered, String month, int year, String startDate,
			String endDate, int transportAllownce, int housingAllowance) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
				employeeId, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
		this.transportAllownce = transportAllownce;
		this.housingAllowance = housingAllowance;
	}
	public int getTransportAllownce() {
		return transportAllownce;
	}
	public void setTransportAllownce(int transportAllownce) {
		if (transportAllownce < 0) {
            System.out.println(" Cannot be negative");
            this.transportAllownce = 0;
        } else {
            this.transportAllownce = transportAllownce;
        }
    }
	public int getHousingAllowance() {
		return housingAllowance;
	}
	public void setHousingAllowance(int housingAllowance) {
		if (housingAllowance < 0) {
            System.out.println(" Cannot be negative.");
            this.housingAllowance = 0;
        } else {
            this.housingAllowance = housingAllowance;
        }
    }
	
}
