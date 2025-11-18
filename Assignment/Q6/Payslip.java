package ID_27842.q6;
import java.util.Scanner;
public class Payslip extends  Payroll  {
	private int payslipNumber;
	private String issueDate;
	public Payslip(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail, String deptName, String deptCode, String managerName, int employeeId, String fullName,
			String position, int baseSalary, boolean rssbRegistered, String month, int year, String startDate,
			String endDate, int transportAllownce, int housingAllowance, double rssbContribution, int payrTax,
			int loanDeduction, int overtimeHours, int overtimeRate, int bonus, int grossSalary, int totalDeductions,
			int netSalary, int payslipNumber, String issueDate) {
		super(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
				employeeId, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
				transportAllownce, housingAllowance, rssbContribution, payrTax, loanDeduction, overtimeHours,
				overtimeRate, bonus, grossSalary, totalDeductions, netSalary);
		this.payslipNumber = payslipNumber;
		this.issueDate = issueDate;
	}
	public int getPayslipNumber() {
		return payslipNumber;
	}
	public void setPayslipNumber(int payslipNumber) {
		this.payslipNumber = payslipNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public void generatePayslip(double taxes, double discounts) {
        

        System.out.println("================ PAYSLIP REPORT ================");
        System.out.println("Payslip No: " + payslipNumber + " | Issued: " + issueDate+"27842");
        System.out.println("Employee: " + getFullName() + " | ID: " + getEmployeeId()+"27842");
        System.out.println("Period: " + getMonth() + "/" + getYear() + " (" + getStartDate() + " to " + getEndDate() + ")"+"27842");
        
        System.out.printf("GROSS PAY: %.2f\n", getGrossSalary()+"27842");
        System.out.println("--- Deductions ---");
        System.out.printf("  RSSB Contribution %.2f\n", getRssbContribution()+"27842");
        System.out.printf("  PAYE Tax:               %.2f\n", getPayrTax()+"27842");
        System.out.printf("  Loan Deductions:        %.2f\n", getLoanDeduction()+"27842");
        System.out.printf("TOTAL DEDUCTIONS:         %.2f\n", getTotalDeductions()+"27842");
        
        System.out.printf("NET PAY: %.2f\n", getNetSalary());
        
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int iD = 0;
        String createdDate = null;
        String updatedDate = null;
        String orgName = null;
        String orgCode = null; 
        String rssbNumber = null;
        String contactEmail = null;
        String deptName = null;
        String deptCode = null;
        String managerName = null;
        int employeeId = 0;
        String fullName = null;
        String position = null;
        int baseSalary = 0;
        boolean rssbRegistered = false;
        String month = null;
        int year = 0;
        String startDate = null;
        String endDate = null;
        int transportAllownce = 0;
        int housingAllowance = 0;
        double rssbContribution = 0;
        int payrTax = 0;
        int loanDeduction = 0;
        int overtimeHours = 0;
        int overtimeRate = 0;
        int bonus = 0;
        int grossSalary = 0;
        int totalDeductions = 0;
        int netSalary = 0;
        int payslipNumber = 0;
        String issueDate = null;

        System.out.println("Enter ID:");
        iD = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Created Date");
        createdDate = sc.nextLine();

        System.out.println("Enter Updated Date");
        updatedDate = sc.nextLine();

        
        System.out.println("Enter Org Name");
        orgName = sc.nextLine();

        System.out.println("Enter Org Code (Sode)");
        orgCode = sc.nextLine();

        System.out.println("Enter RSSB Number");
        rssbNumber = sc.nextLine();
        sc.nextLine(); 

        System.out.println("Enter Contact Email");
        contactEmail = sc.nextLine();

        
        System.out.println("Enter Department Name");
        deptName = sc.nextLine();

        System.out.println("Enter Department Code");
        deptCode = sc.nextLine();
        sc.nextLine(); 

        System.out.println("Enter Manager Name");
        managerName = sc.nextLine();

       
        System.out.println("Enter Employee ID");
        employeeId = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Full Name");
        fullName = sc.nextLine();

        System.out.println("Enter Position");
        position = sc.nextLine();

        System.out.println("Enter Base Salary");
        baseSalary = sc.nextInt();

        System.out.println("Is RSSB Registered?");
        rssbRegistered = sc.nextBoolean();
        sc.nextLine(); 

     
        System.out.println("Enter Month");
        month = sc.nextLine();

        System.out.println("Enter Year");
        year = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Start Date");
        startDate = sc.nextLine();

        System.out.println("Enter End Date");
        endDate = sc.nextLine();

        
        System.out.println("Enter Transport Allowance");
        transportAllownce = sc.nextInt();

        System.out.println("Enter Housing Allowance");
        housingAllowance = sc.nextInt();

        
        System.out.println("Enter RSSB Contribution");
        rssbContribution = sc.nextInt();

        System.out.println("Enter PAYE Tax");
        payrTax = sc.nextInt();

        System.out.println("Enter Loan Deduction");
        loanDeduction = sc.nextInt();

        
        System.out.println("Enter Overtime Hours");
        overtimeHours = sc.nextInt();

        System.out.println("Enter Overtime Rate");
        overtimeRate = sc.nextInt();

        System.out.println("Enter Bonus");
        bonus = sc.nextInt();

        
        System.out.println("Enter Gross Salary");
        grossSalary = sc.nextInt();

        System.out.println("Enter Total Deductions");
        totalDeductions = sc.nextInt();

        System.out.println("Enter Net Salary");
        netSalary = sc.nextInt();

        
        System.out.println("Enter Payslip Number");
        payslipNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Issue Date");
        issueDate = sc.nextLine();

        
        Payslip report = new Payslip(iD, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeId, fullName, position, baseSalary, rssbRegistered, 
            month, year, startDate, endDate,transportAllownce, housingAllowance, rssbContribution, payrTax, loanDeduction, overtimeHours, overtimeRate, bonus, 
            grossSalary, totalDeductions, netSalary, payslipNumber, issueDate);

        
        
        sc.close();
    


	}

}

	

