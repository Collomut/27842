package ID_27842.q4;

public class Inspection extends Delivery {
	private String inspectorName;
	private String status;
	private String remarks;
	public Inspection(int iD, String createdDate, String updatedDate, String orgName, String address,
			String contactEmail, String deptName, String deptCode, String supplierName, String supplierTin, String contact,
			String productName, int unitPrice, int quantity, int poNumber, String orderDate, int totalAmount,
			String deliveryDate, String deliveredBy, String inspectorName, String status, String remarks) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName,
				supplierTin, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate,
				deliveredBy);
		this.inspectorName = inspectorName;
		this.status = status;
		this.remarks = remarks;
	}
	public String getInspectorName() {
		return inspectorName;
	}
	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		String statusLower = status != null ? status.toLowerCase() : "";
        if (!statusLower.equals("passed") && !statusLower.equals("failed")) {
            System.out.println(" Must be Passed or Failed");
            this.status = "Failed";
        } else {
            this.status = status;
        }
    }
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
