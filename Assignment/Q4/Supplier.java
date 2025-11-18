package ID_27842.q4;

public class Supplier extends Department {
	private String supplierName;
	private String supplierTin;
	private String contact;
	public Supplier(int iD, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
			String deptName, String deptCode, String supplierName, String supplierTin,String contact) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
		this.supplierName = supplierName;
		this.supplierTin = supplierTin;
		this.contact = contact;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierTin() {
		return supplierTin;
	}
	public void setSupplierTin(String supplierTin) {
		if (supplierTin == null || !supplierTin.matches("^\\d{9}$")) {
            System.out.println(" Must be exactly 9 digits");
            this.supplierTin = "000000000";
        } else {
            this.supplierTin = supplierTin;
        }
    }
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		if (contact == null || !contact.matches("^\\d{10}$")) {
            System.out.println("⚠️ Validation FAILED for Contact Phone: Must be 10 digits. Setting to '0000000000'.");
            this.contact = "0000000000";
        } else {
            this.contact = contact;
        }
    }
	
}
