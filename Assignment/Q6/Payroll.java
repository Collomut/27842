package ID_27842.q6;

public class Payroll extends Allowance {
	private int grossSalary;
	private int totalDeductions;
	private int netSalary;
	public Payroll(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered, String month, int year, String startDate,
			String endDate, int transportAllownce, int housingAllowance, double rssbContribution, int payrTax,
			int loanDeduction, int overtimeHours, int overtimeRate, int bonus, int grossSalary, int totalDeductions,
			int netSalary) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
				employeeId, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
				transportAllownce, housingAllowance, rssbContribution, payrTax, loanDeduction, overtimeHours,
				overtimeRate, bonus);
		this.grossSalary = grossSalary;
		this.totalDeductions = totalDeductions;
		this.netSalary = netSalary;
		this.calculatePayroll();
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getTotalDeductions() {
		return totalDeductions;
	}
	public void setTotalDeductions(int totalDeductions) {
		this.totalDeductions = totalDeductions;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}
	public void calculatePayroll() {
        
        double calculatedGrossSalary = getBaseSalary() + getHousingAllowance() + getOvertimeRate() + getBonus();
        
        
        double calculatedTotalDeductions = getTotalDeductions(); 
        
        
        double calculatedNetSalary = calculatedGrossSalary - calculatedTotalDeductions;
}
}
