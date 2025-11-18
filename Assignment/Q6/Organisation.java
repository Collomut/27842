package ID_27842.q6;

public class Organisation extends Entity{
	private String orgName;
	private String orgCode;
	private String rssbNumber;
	private String contactEmail;
	public Organisation(int iD, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber,
			String contactEmail) {
		super(iD, createdDate, updatedDate);
		this.orgName = orgName;
		this.orgCode = orgCode;
		this.rssbNumber = rssbNumber;
		this.contactEmail = contactEmail;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		if (orgCode == null || orgCode.trim().length() < 3) {
            System.out.println(" Must be >= 3 chars");
            this.orgCode = "";
        } else {
            this.orgCode = orgCode;
        }
    }
	public String getRssbNumber() {
		return rssbNumber;
	}
	public void setRssbNumber(String rssbNumber) {
		if (rssbNumber == null || !rssbNumber.matches("^\\d{8}$")) {
            System.out.println(" Must be exactly 8 digits");
            this.rssbNumber = "00000000";
        } else {
            this.rssbNumber = rssbNumber;
        }
    }
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		if (contactEmail == null || !contactEmail.contains("@") || !contactEmail.contains(".")) {
            System.out.println(" Invalid format. ");
            this.contactEmail = "";
        } else {
            this.contactEmail = contactEmail;
        }
    }
}
