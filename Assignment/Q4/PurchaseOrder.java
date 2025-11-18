package ID_27842.q4;

public class PurchaseOrder extends Product {
	private int poNumber; 
	private String orderDate;
	private int totalAmount;
	public PurchaseOrder(int iD, String createdDate, String updatedDate, String orgName, String address,
			String contactEmail, String deptName, String deptCode, String supplierName, String supplierTin, String contact,
			String productName, int unitPrice, int quantity, int poNumber, String orderDate, int totalAmount) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName,
				supplierTin, contact, productName, unitPrice, quantity);
		this.poNumber = poNumber;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}
	public int getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		if (totalAmount <= 0) {
            System.out.println(" Must be > 0");
            this.totalAmount = 0;
        } else {
            this.totalAmount = totalAmount;
        }
    }
	
}
