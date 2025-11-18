package ID_27842.q1;

public class Purchase extends StockItem {
	private String purchaseDate;
	private int purchasedQuantity;
	private String supplierName;
	public Purchase(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable,
			int reorderLevel, String purchaseDate, int purchasedQuantity, String supplierName2) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable,
				reorderLevel);
		this.setPurchaseDate (purchaseDate);
		this.setPurchasedQuantity (purchasedQuantity);
		supplierName = supplierName2;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		if (purchaseDate == null || purchaseDate.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.purchaseDate = "";
        } else {
            this.purchaseDate = purchaseDate;
        }
    }
	
	public int getPurchasedQuantity() {
		return purchasedQuantity;
	}
	public void setPurchasedQuantity(int purchasedQuantity) {
		if (purchasedQuantity <= 0) {
            System.out.println(" Must be > 0");
            this.purchasedQuantity = 1;
        } else {
            this.purchasedQuantity = purchasedQuantity;
        }
    
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
}
