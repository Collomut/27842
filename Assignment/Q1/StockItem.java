package ID_27842.q1;

public class StockItem extends Product {
	private int quantityAvailable;
	private int reorderLevel;
	public StockItem(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable,
			int reorderLevel) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit);
		this.setQuantityAvailable ( quantityAvailable);
		this.setReorderLevel (reorderLevel);
	}
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		if (quantityAvailable < 0) {
            System.out.println(" Cannot be negative");
            this.quantityAvailable = 0;
        } else {
            this.quantityAvailable = quantityAvailable;
        }
    
	}
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	
}
