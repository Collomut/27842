package ID_27842.q1;

public class Category extends Warehouse {
	private String categoryName;
	private String categoryCode;
	public Category(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber, String categoryName, String categoryCode) {
		super(iD, createdDate, updatedDate, warehouseName, location, contactNumber);
		this.setCategoryName (categoryName);
		this.setCategoryCode (categoryCode);
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		if(categoryCode == null || categoryCode.length()<=3) {
			System.out.println("Must have more than 3 Charachters");
			this.categoryCode="";
		}else {
		this.categoryCode = categoryCode;
		}
	}
	
}
