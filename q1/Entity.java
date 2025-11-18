package ID_27842.q1;

public class Entity {
	private int ID;
	private String createdDate;
	private String updatedDate;
	
	public Entity(int iD, String createdDate, String updatedDate) {
		super();
		this.setID(iD);
		this.setCreatedDate(createdDate);
		this.setCreatedDate(updatedDate);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		
		if(ID<=0) {
			System.out.println("ID cannot be zero");
			this.ID=1;
		}else {
			this.ID=iD;
		}
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		if(createdDate == null || createdDate.trim().isEmpty()) {
			System.out.println("Date Cannot be Empty");
			this.createdDate="";
		}else {
		
		this.createdDate = createdDate;
		}
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
