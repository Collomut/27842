package ID_27842.q4;
import java.util.Scanner;
public class ProcurementReport extends Invoice {
	private String reportDate;
	private String summary;
	public ProcurementReport(int iD, String createdDate, String updatedDate, String orgName, String address,
			String contactEmail, String deptName, String deptCode, String supplierName, String supplierTin, String contact,
			String productName, int unitPrice, int quantity, int poNumber, String orderDate, int totalAmount,
			String deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, int invoiceNo,
			int invoiceAmount, String reportDate, String summary) {
		super(iD, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName,
				supplierTin, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate,
				deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
		this.reportDate = reportDate;
		this.summary = summary;
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public double calculateTotal() {
        
        double total = getInvoiceAmount(); 

        System.out.println("\n--- Procurement Total Calculation ---");
        System.out.println("Invoice Amount: " + total+"27842");
        
        
        return total;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
				int Entity_id=0;
				String Creation_date=null;
				String Updated_date=null;
				String Org_name=null;
				String address=null;
				String Contact_email=null;
				String department_name=null;
				String department_code=null;
				String Supplier_name=null;
				String Supplier_tin=null;
				String contact=null;
				String Product_name=null;
				int Unit_price=0;
				int quantity=0;
				int ponumber=0;
				String Order_date=null;
				int Total_amount=0;
				String Delivery_date=null;
				String Delivered_by=null;
				String Inspector_name=null;
				String status=null;
				String Remarks=null;
				int Invoice_no=0;
				int Invoice_amount=0;
				String Report_date=null;
				String Summary=null;

				System.out.println("\nEnter Entity ID");
				Entity_id = sc.nextInt();
				sc.nextLine(); 

				System.out.println("Enter The Creation Date");
				Creation_date = sc.nextLine();

				System.out.println("Enter Updated Date");
				Updated_date = sc.nextLine();

				System.out.println("Enter Organisation Name");
				Org_name = sc.nextLine();

				System.out.println("Enter Address");
				address = sc.nextLine();

				System.out.println("Enter the Contact Email");
				Contact_email = sc.nextLine();

				System.out.println("Enter the Department Name");
				department_name = sc.nextLine();

				System.out.println("Enter the Department Code");
				department_code = sc.nextLine();
				sc.nextLine(); 

				System.out.println("Enter the Supplier Name");
				Supplier_name = sc.nextLine();

				System.out.println("Enter the Supplier tin");
				Supplier_tin = sc.nextLine();

				System.out.println("Enter the contact");
				contact = sc.nextLine();
				sc.nextLine(); 

				System.out.println("Enter the Product Name");
				Product_name = sc.nextLine();

				System.out.println("Enter the Unit Price ");
				Unit_price = sc.nextInt();

				System.out.println("Enter the Quantity");
				quantity = sc.nextInt();

				System.out.println("Enter the Product Number");
				ponumber = sc.nextInt();
				sc.nextLine(); 

				System.out.println("Enter the Order Date");
				Order_date = sc.nextLine();

				System.out.println("Enter the Total Amount");
				Total_amount = sc.nextInt();
				sc.nextLine(); 
				
				System.out.println("Enter the Delivery date");
				Delivery_date = sc.nextLine();

				System.out.println("Enter name of the person that delivered");
				Delivered_by = sc.nextLine();

				System.out.println("Enter the Inspector Name");
				Inspector_name = sc.nextLine();

				System.out.println("Enter the Status");
				status = sc.nextLine();

				System.out.println("Enter the Remarks");
				Remarks = sc.nextLine();

				System.out.println("Enter the Invoice Number");
				Invoice_no = sc.nextInt();

				System.out.println("Enter The Invoice Amount");
				Invoice_amount = sc.nextInt();
				sc.nextLine(); 

				System.out.println("Enter the Report Date");
				Report_date = sc.nextLine();

				System.out.println("Enter the Summary");
				Summary = sc.nextLine();

		        
				ProcurementReport pr = new ProcurementReport(Entity_id, Creation_date, Updated_date, Org_name, address, Contact_email, department_name, department_code,
						Supplier_name, Supplier_tin, contact, Product_name, Unit_price, quantity, ponumber, Order_date, Total_amount,Delivery_date, 
						Delivered_by, Inspector_name, status, Remarks, Invoice_no, Invoice_amount, Report_date, Summary);
				
		        pr.calculateTotal();
		        sc.close();
			}

		}


