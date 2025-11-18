package ID_27842.q6;

public class Deduction extends SalaryStructure{
	private double rssbContribution;
	private int payrTax;
	private int loanDeduction;
	public Deduction(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered, String month, int year, String startDate,
			String endDate, int transportAllownce, int housingAllowance, double rssbContribution, int payrTax,
			int loanDeduction) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
				employeeId, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
				transportAllownce, housingAllowance);
		this.rssbContribution = rssbContribution;
		this.payrTax = payrTax;
		this.loanDeduction = loanDeduction;
	}
	public double getRssbContribution() {
		return rssbContribution;
	}
	public void setRssbContribution(int rssbContribution) {
		double expectedContribution = getBaseSalary() * 0.05;
        if (rssbContribution < expectedContribution) {
            System.out.printf(" incorrect Value. ", expectedContribution);
            this.rssbContribution = expectedContribution;
        } else if (rssbContribution < 0) {
             System.out.println("Validation FAILED ");
             this.rssbContribution = 0;
        } else {
            this.rssbContribution = rssbContribution;
        }
    }
	public int getPayrTax() {
		return payrTax;
	}
	public void setPayrTax(int payrTax) {
		if (payrTax < 0) {
            System.out.println(" Cannot be negative");
            this.payrTax = 0;
        } else {
            this.payrTax = payrTax;
        }
    }
	public int getLoanDeduction() {
		return loanDeduction;
	}
	public void setLoanDeduction(int loanDeduction) {
		if (loanDeduction < 0) {
            System.out.println(" Cannot be negative");
            this.loanDeduction = 0;
        } else {
            this.loanDeduction = loanDeduction;
        }
    }
	
}
