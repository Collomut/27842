package ID_27842.q3;

public class Payment extends TaxAssesment {
	private String paymentDate;
	private int paymentAmount;
	public Payment(int iD, String createdDate, String updatedDate, String authorityName, String region, String email,
			String categoryName, int rate, int code, String tin, String taxpayerName, String address, String employerName,
			String employerTin, int contact, String employeeName, int salary, String employeeTin, String declarationMonth,
			int totalIncome, String assessmentDate, int assessedTax, String paymentDate, int paymentAmount) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName,
				address, employerName, employerTin, contact, employeeName, salary, employeeTin, declarationMonth,
				totalIncome, assessmentDate, assessedTax);
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		if (paymentAmount <= 0) {
            System.out.println(" Must be > 0");
            this.paymentAmount = 1;
        } else {
            this.paymentAmount = paymentAmount;
        }
    }
	
}
