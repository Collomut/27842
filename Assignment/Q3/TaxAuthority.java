package ID_27842.q3;

public class TaxAuthority extends Entity {
	private String authorityName;
	private String region; 
	private String email;
	public TaxAuthority(int iD, String createdDate, String updatedDate, String authorityName, String region,
			String email) {
		super(iD, createdDate, updatedDate);
		this.setAuthorityName ( authorityName);
		this.setRegion ( region);
		this.setEmail ( email);
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println(" Invalid format.");
            this.email = "";
        } else {
            this.email = email;
        }
		
    }
}
