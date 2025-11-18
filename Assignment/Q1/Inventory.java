package ID_27842.q1;

public class Inventory extends Sale {
	private int totalItems;
	private double stockValue;
	public Inventory(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable,
			int reorderLevel, String purchaseDate, int purchasedQuantity, String supplierName2, String saleDate,
			int soldQuantity, String customerName, int totalItems, double stockValue) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable,
				reorderLevel, purchaseDate, purchasedQuantity, supplierName2, saleDate, soldQuantity, customerName);
		this.setTotalItems ( totalItems);
		this.setStockValue ( stockValue);
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public double getStockValue() {
		return stockValue;
	}
	public void setStockValue(double stockValue) {
		if (stockValue < 0) {
            System.out.println("Cannot be negative");
            this.stockValue = 0;
        } else {
            this.stockValue = stockValue;
        }
    
	}
	
}
