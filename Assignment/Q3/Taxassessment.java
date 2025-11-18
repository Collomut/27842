package ID_27842.q3;

public class TaxAssesment extends TaxDeclaration{
	private String assessmentDate;
	private int assessedTax;
	public TaxAssesment(int iD, String createdDate, String updatedDate, String authorityName, String region,
			String email, String categoryName, int rate, int code, String tin, String taxpayerName, String address,
			String employerName, String employerTin, int contact, String employeeName, int salary, String employeeTin,
			String declarationMonth, int totalIncome, String assessmentDate, int assessedTax) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName,
				address, employerName, employerTin, contact, employeeName, salary, employeeTin, declarationMonth,
				totalIncome);
		this.assessmentDate = assessmentDate;
		this.assessedTax = assessedTax;
	}
	public String getAssessmentDate() {
		return assessmentDate;
	}
	public void setAssessmentDate(String assessmentDate) {
		this.assessmentDate = assessmentDate;
	}
	public int getAssessedTax() {
		return assessedTax;
	}
	public void setAssessedTax(int assessedTax) {
		if (assessedTax < 0) {
            System.out.println(" Cannot be negative");
            this.assessedTax = 0;
        } else {
            this.assessedTax = assessedTax;
        }
    }
	
}
