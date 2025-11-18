package ID_27842.q3;

public class Employer extends Taxpayer{
	private String employerName;
	private String employerTin;
	private int contact;
	public Employer(int iD, String createdDate, String updatedDate, String authorityName, String region, String email,
			String categoryName, int rate, int code, String tin, String taxpayerName, String address, String employerName,
			String employerTin, int contact) {
		super(iD, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName,
				address);
		this.employerName = employerName;
		this.employerTin = employerTin;
		this.contact = contact;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerTin() {
		return employerTin;
	}
	public void setEmployerTin(String employerTin) {
		if (employerTin == null || !employerTin.matches("^\\d{9}$")) {
            System.out.println(" Must be exactly 9 digits");
            this.employerTin = "000000000";
        } else {
            this.employerTin = employerTin;
        }
    }
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
}
