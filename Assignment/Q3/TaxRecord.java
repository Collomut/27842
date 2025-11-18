package ID_27842.q3;
import java.util.Scanner;
public class TaxRecord extends Payment{
	private int receiptNo;
	private int totalTax;
	public TaxRecord(int iD, String createdDate, String updatedDate, String authorityName, String region, String email,
			String categoryName, int rate, int code, String tin, String taxpayerName, String address, String employerName,
			String employerTin, int contact, String employeeName, int salary, String employeeTin, String declarationMonth,
			int totalIncome, String assessmentDate, int assessedTax, String paymentDate, int paymentAmount,
			int receiptNo, int totalTax) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName,
				address, employerName, employerTin, contact, employeeName, salary, employeeTin, declarationMonth,
				totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
		this.receiptNo = receiptNo;
		this.totalTax = totalTax;
	}
	public int getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}
	public int getTotalTax() {
		return totalTax;
	}
	public void setTotalTax(int totalTax) {
		this.totalTax = totalTax;
	}
	public double computeTax(double credits) {
        
        double salary = getSalary(); 
        double rate = getRate();
        
        double computedTax = (salary * rate) - credits;
        
        System.out.println("--- Tax Computation Summary ---");
        System.out.println("Employee: " + getEmployeeName() + " (Salary: " + salary + ")"+"27842");
        System.out.println("Tax Rate: " + (rate * 100) + "%"+"27842");
        System.out.println("Credits Applied: " + credits+"27842");
       
        System.out.println("Final Computed Tax: " + computedTax+"27842");
        
        return computedTax;
    }

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int Entity_id=0;
		String Creation_date=null;
		String Updated_date=null;
		String Authority_name=null;
		String region=null;
		String email=null;
		String Category_name=null;
		int rate=0;
		int code=0;
		String tin=null;
		String Taxpayer_name=null;
		String address=null;
		String Employer_name=null;
		String Employer_tin=null;
		int contact=0;
		String Employee_name=null;
		int Salary=0;
		String Employee_tin=null;
		String Declaration_month=null;
		int Total_income=0;
		String Assessment_date=null;
		int Assessed_tax=0;
		String Payment_date=null;
		int Payment_amount=0;
		int Receipt_no=0;
		int Total_tax=0;
		

		System.out.println("Enter Entity ID");
		Entity_id = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter The Creation Date");
		Creation_date = sc.nextLine();

		System.out.println("Enter Updated Date");
		Updated_date = sc.nextLine();

		System.out.println("Enter Authority Name");
		Authority_name = sc.nextLine();

		System.out.println("Enter Region");
		region = sc.nextLine();

		System.out.println("Enter the Email");
		email = sc.nextLine();

		System.out.println("Enter the Category Name");
		Category_name = sc.nextLine();

		System.out.println("Enter the rate");
		rate = sc.nextInt();

		System.out.println("Enter the code");
		code = sc.nextInt();

		System.out.println("Enter the tin");
		tin = sc.nextLine();
		sc.nextLine(); 

		System.out.println("Enter the Taxpayer's Name");
		Taxpayer_name = sc.nextLine();

		System.out.println("Enter the address");
		address = sc.nextLine();

		System.out.println("Enter the Employer Name");
		Employer_name = sc.nextLine();

		System.out.println("Enter the Employer Tin");
		Employer_tin = sc.nextLine();

		System.out.println("Enter the contact");
		contact = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter the Employee Name");
		Employee_name = sc.nextLine();

		System.out.println("Enter the Salary");
		Salary = sc.nextInt();

		System.out.println("Enter the Employee Tin");
		Employee_tin = sc.nextLine();
		sc.nextLine(); 

		System.out.println("Enter the Declaration Month");
		Declaration_month = sc.nextLine();

		System.out.println("Enter the Total Income");
		Total_income = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter the Assessment date");
		Assessment_date = sc.nextLine();

		System.out.println("Enter the Assessment tax");
		Assessed_tax = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter the Payment date");
		Payment_date = sc.nextLine();

		System.out.println("Enter The Payment amount");
		Payment_amount = sc.nextInt();

		System.out.println("Enter the Receipt Number");
		Receipt_no = sc.nextInt();

		System.out.println("Enter the Total tax");
		Total_tax = sc.nextInt();
		sc.nextLine(); 

        
		TaxRecord tr = new TaxRecord(Entity_id, Creation_date, Updated_date, Authority_name, region, email, Category_name, rate, code, tin, Taxpayer_name,
				address, Employer_name, Employer_tin, contact, Employee_name, Salary, Employee_tin, Declaration_month, Total_income, Assessment_date, 
            Assessed_tax, Payment_date, Payment_amount, Receipt_no, Total_tax);

        
        sc.close();

	}

}

