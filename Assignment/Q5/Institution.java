package ID_27842.q5;

public class Institution extends Entity {
	private String institutionName;
	private String code;
	private String address;
	public Institution(int iD, String createdDate, String updatedDate, String institutionName, String code,
			String address) {
		super(iD, createdDate, updatedDate);
		this.institutionName = institutionName;
		this.code = code;
		this.address = address;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		
	        
	        if (code == null || code.trim().length() < 3) {
	            System.out.println(" Must be >= 3 chars");
	            this.code = "";
	        } else {
	            this.code = code;
	        }
		
		}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
