package ID_27842.q1;

public class Supplier extends Category {
	private String supplierName; 
	private String supplierEmail;
	private int supplierPhone;
	public Supplier(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode);
		this.setSupplierName (supplierName);
		this.setSupplierEmail (supplierEmail);
		this.setSupplierPhone (supplierPhone);
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		if (supplierEmail == null || !supplierEmail.contains("@") || !supplierEmail.contains(".")) {
            System.out.println(" Invalid format.");
            this.supplierEmail = "";
        } else {
            this.supplierEmail = supplierEmail;
        }
    
	}
	public int getSupplierPhone() {
		return supplierPhone;
	}
	public void setSupplierPhone(int supplierPhone) {
		String phoneStr = String.valueOf(supplierPhone);
        if (phoneStr.length() != 10) {
            System.out.println("Must be 10 digits");
            this.supplierPhone = 0;
        } else {
            this.supplierPhone = supplierPhone;
        }
    
		
	}
	
}
