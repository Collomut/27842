package ID_27842.q4;

public class Entity {
	private int ID;
	private String createdDate;
	private String updatedDate;
	public Entity(int iD, String createdDate, String updatedDate) {
		super();
		this.setID ( iD);
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		if (iD <= 0) {
            System.out.println(" ID must be > 0");
            this.ID = 1;
        } else {
            this.ID = iD;
        }
    }
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		if (createdDate == null || createdDate.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.createdDate = "";
        } else {
            this.createdDate = createdDate;
        }
    }
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		if (updatedDate == null || updatedDate.trim().isEmpty()) {
            System.out.println(" Cannot be empty");
            this.updatedDate = "";
        } else {
            this.updatedDate = updatedDate;
        }
    }
}
