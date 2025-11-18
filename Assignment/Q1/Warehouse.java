package ID_27842.q1;

public class Warehouse extends Entity {
	private String warehouseName;
	private String location;
	private int contactNumber;
	public Warehouse(int iD, String createdDate, String updatedDate, String warehouseName, String location,
			int contactNumber) {
		super(iD, createdDate, updatedDate);
		this.setWarehouseName(warehouseName);
		this.setLocation(location);
		this.setContactNumber(contactNumber);
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		String contactStr = String.valueOf(contactNumber);
		if(contactStr.length() != 10) {
			System.out.println("Contact must have 10 numbers");
		}else {
		this.contactNumber = contactNumber;
		}
	}
	
	
}
