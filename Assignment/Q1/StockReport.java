package ID_27842.q1;
import java.util.Scanner;
public class StockReport extends Inventory {
	private String reportDate;
	private String remarks;
	public StockReport(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			int supplierPhone, String productName, double unitPrice, int stockLimit, int quantityAvailable,
			int reorderLevel, String purchaseDate, int purchasedQuantity, String supplierName2, String saleDate,
			int soldQuantity, String customerName, int totalItems, double stockValue, String reportDate,
			String remarks) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable,
				reorderLevel, purchaseDate, purchasedQuantity, supplierName2, saleDate, soldQuantity, customerName,
				totalItems, stockValue);
		this.setReportDate (reportDate);
		this.setRemarks (remarks);
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public void generateReport() {
        System.out.println("================ STOCK REPORT ================");
        System.out.println("Report Date: " + reportDate+"27842");
        System.out.println("Warehouse: " + getWarehouseName() + " (" + getLocation() + ")"+"27842");
        System.out.println("Product: " + getProductName() + " | Price: " + getUnitPrice()+"27842");
        System.out.println("Stock Available: " + getQuantityAvailable()+"27842");
        System.out.println("Total Sales Qty: " + getSoldQuantity()+"27842");
        System.out.println("Total Stock Value: " + getStockValue()+"27842");
        System.out.println("Remarks: " + remarks+"27842");
        System.out.println("==============================================");
    }


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Entity_id=0;
	String Creation_date=null;
	String Updated_date=null;
	String Warehouse_name=null;
	String Warehouse_location=null;
	int Contact_number=0;
	String Category_name=null;
	String Category_code=null;
	String Suppliers_name=null;
	String Suppliers_email=null;
	int Suppliers_phone=0;
	String Product_name=null;
	int Unit_price=0;
	int Stock_limit=0;
	int Quantity_available=0;
	int Reorder_level=0;
	String Purchase_date=null;
	int Purchase_quantity=0;
	String Supplier_name=null;
	String Sale_date=null;
	int Sold_quantity=0;
	String Customer_name=null;
	int Total_items=0;
	int Stock_value=0;
	String Report_date=null;
	String Remark=null;
	
	System.out.println("Enter Entity ID");
	Entity_id = sc.nextInt();
    sc.nextLine(); 
	
	System.out.println("Enter The Creation Date");
	Creation_date = sc.nextLine();
	
	System.out.println("Enter Updated Date");
	Updated_date = sc.nextLine();
	
	System.out.println("Enter Warehouse Name");
	Warehouse_name = sc.nextLine();
	
	System.out.println("Enter Warehouse Location");
	Warehouse_location = sc.nextLine();
	
	System.out.println("Enter the Contact Number");
	Contact_number = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Category Name");
	Category_name = sc.nextLine();
	
	System.out.println("Enter the Category Code");
	Category_code = sc.nextLine();
	
	System.out.println("\nEnter the Suppliers Name");
	Suppliers_name = sc.nextLine();
	
	System.out.println("Enter the Suppliers Email");
	Suppliers_email = sc.nextLine();
	
	System.out.println("Enter the Suppliers Phone");
	Suppliers_phone = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter the product name");
	Product_name = sc.nextLine();
	
	System.out.println("Enter the unit Price");
    Unit_price = sc.nextInt();
	
	System.out.println("Enter the Stock Limit");
	Stock_limit = sc.nextInt();
	
	System.out.println("Enter the Quantity available");
	Quantity_available = sc.nextInt();
	
	System.out.println("Enter the Reorder Level");
	Reorder_level = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Purchase Date");
	Purchase_date = sc.nextLine();
	
	System.out.println("Enter the Purchased Quantity");
	Purchase_quantity = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Supplier Name (for Purchase record)");
	Supplier_name = sc.nextLine();
	
	System.out.println("Enter the Sale Date");
	Sale_date = sc.nextLine();
	
	System.out.println("Enter the Sold Quantity");
	Sold_quantity = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Customer Name");
	Customer_name = sc.nextLine();

	System.out.println("Enter the Total Items");
	Total_items = sc.nextInt();
	
	System.out.println("Enter the Stock Value");
	Stock_value = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("\nEnter The Report Date");
	Report_date = sc.nextLine();
	
	System.out.println("Enter the Remarks");
	Remark = sc.nextLine();
	
   
	StockReport st = new StockReport(Entity_id, Creation_date, Updated_date, Warehouse_name, Warehouse_location, Contact_number,  Category_name, Category_code,
			Suppliers_name, Suppliers_email, Suppliers_phone, Product_name, Unit_price, Stock_limit, Quantity_available, Reorder_level, Purchase_date, Purchase_quantity,
        Supplier_name, Sale_date, Sold_quantity, Customer_name, Total_items, Stock_value, Report_date, Remark);
    
	st.generateReport();
    
    sc.close();
	
	
}

}
