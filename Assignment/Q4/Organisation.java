package ID_27842.q4;


public class Organisation extends Entity {
	private String orgName;
	private String address;
	private String contactEmail;
	public Organisation(int iD, String createdDate, String updatedDate, String orgName, String address,
			String contactEmail) {
		super(iD, createdDate, updatedDate);
		this.orgName = orgName;
		this.address = address;
		this.contactEmail = contactEmail;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void getContactEmail() {
		
	}
		
	public void setContactEmail(String contactEmail) {
		if (contactEmail == null || !contactEmail.contains("@") || !contactEmail.contains(".")) {
            System.out.println(" Invalid format");
            this.contactEmail = "N/A";
        } else {
            this.contactEmail = contactEmail;
        }
	
	
}
}
