package ID_27842.q3;

public class TaxCategory extends TaxAuthority {
	private String categoryName;
	private int rate;
	private int code;
	public TaxCategory(int iD, String createdDate, String updatedDate, String authorityName, String region,
			String email, String categoryName, int rate, int code) {
		super(iD, createdDate, updatedDate, authorityName, region, email);
		this.setCategoryName ( categoryName);
		this.setRate ( rate);
		this.setCode (code);
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		if (rate <= 0) {
            System.out.println(" Must be > 0");
            this.rate = 1;
        } else {
            this.rate = rate;
        }
    }
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
