package ID_27842.q4;

public class Product extends Supplier {
	private String productName;
	private int unitPrice;
	private int quantity;
	public Product(int iD, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
			String deptName, String deptCode, String supplierName, String supplierTin, String contact, String productName,
			int unitPrice, int quantity) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName,
				supplierTin, contact);
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		if (unitPrice <= 0) {
            System.out.println(" Setting price to 1");
            this.unitPrice = 1;
        } else {
            this.unitPrice = unitPrice;
        }
    }
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity < 0) {
            System.out.println(" Quantity cannot be negative");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }
	
}
