package ID_27842.q1;

public class Product extends Supplier {
	private String productName;
	private double unitPrice;
	private int stockLimit;
	public Product(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone, String productName, double unitPrice, int stockLimit) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone);
		this.setProductName (productName);
		this.setUnitPrice ( unitPrice);
		this.setStockLimit ( stockLimit);
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		if (unitPrice <= 0) {
            System.out.println("Price must be > 0");
            this.unitPrice = 1;
        } else {
            this.unitPrice = unitPrice;
        }
    }
	
	public int getStockLimit() {
		return stockLimit;
	}
	public void setStockLimit(int stockLimit) {
		
		if (stockLimit < 0) {
            System.out.println(" Cannot be negative");
            this.stockLimit = 0;
        } else {
            this.stockLimit = stockLimit;
        }
    }
	
}
