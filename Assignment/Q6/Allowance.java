package ID_27842.q6;

public class Allowance extends Deduction {
	private int overtimeHours;
	private int overtimeRate;
	private int bonus;
	public Allowance(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered, String month, int year, String startDate,
			String endDate, int transportAllownce, int housingAllowance, double rssbContribution, int payrTax,
			int loanDeduction, int overtimeHours, int overtimeRate, int bonus) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
				employeeId, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
				transportAllownce, housingAllowance, rssbContribution, payrTax, loanDeduction);
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
		this.bonus = bonus;
	}
	public int getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public int getOvertimeRate() {
		return overtimeRate;
	}
	public void setOvertimeRate(int overtimeRate) {
		if (overtimeRate < 0) {
            System.out.println(" Cannot be negative. ");
            this.overtimeRate = 0;
        } else {
            this.overtimeRate = overtimeRate;
        }
    this.overtimeRate = overtimeRate;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		if (bonus < 0) {
            System.out.println(" Cannot be negative. ");
            this.bonus = 0;
        } else {
            this.bonus = bonus;
        }
    }
	
}
