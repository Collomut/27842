package ID_27842.q4;

public class Invoice extends Inspection {
	private int invoiceNo;
	private int invoiceAmount;
	public Invoice(int iD, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
			String deptName, String deptCode, String supplierName, String supplierTin, String contact, String productName,
			int unitPrice, int quantity, int poNumber, String orderDate, int totalAmount, String deliveryDate,
			String deliveredBy, String inspectorName, String status, String remarks, int invoiceNo, int invoiceAmount) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName,
				supplierTin, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate,
				deliveredBy, inspectorName, status, remarks);
		this.invoiceNo = invoiceNo;
		this.invoiceAmount = invoiceAmount;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public int getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(int invoiceAmount) {
		if (invoiceAmount <= 0) {
            System.out.println(" Must be > 0");
            this.invoiceAmount = 0;
        } else {
            this.invoiceAmount = invoiceAmount;
        }
    }
	
}
