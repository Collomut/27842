package ID_27842.q4;

public class Delivery extends PurchaseOrder {
	private String deliveryDate;
	private String deliveredBy;
	public Delivery(int iD, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
			String deptName, String deptCode, String supplierName,String supplierTin,String contact, String productName,
			int unitPrice, int quantity, int poNumber, String orderDate, int totalAmount, String deliveryDate,
			String deliveredBy) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName,
				supplierTin, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
		this.deliveryDate = deliveryDate;
		this.deliveredBy = deliveredBy;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		if (deliveryDate == null || deliveryDate.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.deliveryDate = "";
        } else {
            this.deliveryDate = deliveryDate;
        }
    }
	public String getDeliveredBy() {
		return deliveredBy;
	}
	public void setDeliveredBy(String deliveredBy) {
		if (deliveredBy == null || deliveredBy.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.deliveredBy = "N/A";
        } else {
            this.deliveredBy = deliveredBy;
        }
    }
	
}
