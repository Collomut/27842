package ID_27842.q1;

public class Sale extends Purchase {
	private String saleDate;
	private int soldQuantity;
	private String customerName;
	public Sale(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable,
			int reorderLevel, String purchaseDate, int purchasedQuantity, String supplierName2, String saleDate,
			int soldQuantity, String customerName) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable,
				reorderLevel, purchaseDate, purchasedQuantity, supplierName2);
		this.setSaleDate ( saleDate);
		this.setPurchasedQuantity ( soldQuantity);
		this.setCustomerName (customerName);
	}
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		if (saleDate == null || saleDate.trim().isEmpty()) {
            System.out.println(" Setting to ''");
            this.saleDate = "";
        } else {
            this.saleDate = saleDate;
        }
    
	}
	public int getSoldQuantity() {
		return soldQuantity;
	}
	public void setSoldQuantity(int soldQuantity) {
		if (soldQuantity <= 0) {
            System.out.println(" Must be > 0");
            this.soldQuantity = 1;
        } else {
            this.soldQuantity = soldQuantity;
        }
    
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
