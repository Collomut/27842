package ID_27842.q3;

public class Taxpayer extends TaxCategory {
	private String tin;
	private String taxpayerName;
	private String address;
	public Taxpayer(int iD, String createdDate, String updatedDate, String authorityName, String region, String email,
			String categoryName, int rate, int code, String tin, String taxpayerName, String address) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
		this.setTin( tin);
		this.setTaxpayerName (taxpayerName);
		this.setAddress ( address);
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		if (tin == null || !tin.matches("^\\d{9}$")) {
            System.out.println(" Must be exactly 9 digits.");
            this.tin = "000000000";
        } else {
            this.tin = tin;
        }
    }
	public String getTaxpayerName() {
		return taxpayerName;
	}
	public void setTaxpayerName(String taxpayerName) {
		this.taxpayerName = taxpayerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
