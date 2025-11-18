package ID_27842.q3;

public class TaxDeclaration extends Employee {
	private String declarationMonth;
	private int totalIncome;
	public TaxDeclaration(int iD, String createdDate, String updatedDate, String authorityName, String region,
			String email, String categoryName, int rate, int code, String tin, String taxpayerName, String address,
			String employerName, String employerTin, int contact, String employeeName, int salary, String employeeTin,
			String declarationMonth, int totalIncome) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName,
				address, employerName, employerTin, contact, employeeName, salary, employeeTin);
		this.declarationMonth = declarationMonth;
		this.totalIncome = totalIncome;
	}
	public String getDeclarationMonth() {
		return declarationMonth;
	}
	public void setDeclarationMonth(String declarationMonth) {
		this.declarationMonth = declarationMonth;
	}
	public int getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(int totalIncome) {
		if (totalIncome < 0) {
            System.out.println(" Cannot be negative");
            this.totalIncome = 0;
        } else {
            this.totalIncome = totalIncome;
        }
    }
	
}
