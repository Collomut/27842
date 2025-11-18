package ID_27842.q2;

public class CabinCrew extends Pilot  {
	private String crewName;
	private String role;
	private String shift;
	public CabinCrew(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName,
			String role, String shift) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
				flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
		this.setCrewName (crewName);
		this.setRole ( role);
		this.setShift (shift);
	}
	public String getCrewName() {
		return crewName;
	}
	public void setCrewName(String crewName) {
		this.crewName = crewName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if (role == null || role.trim().isEmpty()) {
            System.out.println(" Cannot be empty.");
            this.role = "";
        } else {
            this.role = role;
        }
    
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		if (shift == null || (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))) {
            System.out.println(" Must be Day or Night");
            this.shift = "Day";
        } else {
            this.shift = shift;
        }
    
	}
	
}
