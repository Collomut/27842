package ID_27842.q2;

import java.util.Scanner;

public class Ticket extends Payment {
	private int ticketNumber;
	private String issueDate;
	public Ticket(int iD, String createdDate, String updatedDate, String airportName, String code, String location,
			String airlineName, String airlineCode, String contactEmail, int flightNumber, String departure,
			String destination, int baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName,
			String role, String shift, String passengerName, int age, String gender, int contact, String bookingDate,
			int seatNumber, String travelClass, String paymentDate, String paymentMethod, int amountPaid,
			int ticketNumber, String issueDate) {
		super(iD, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
				flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName,
				role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate,
				paymentMethod, amountPaid);
		this.setTicketNumber ( ticketNumber);
		this.setIssueDate ( issueDate);
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public int calculateFare(int taxes, int discounts) {
        
        int baseFare = getBaseFare();
        int finalFare = baseFare + taxes - discounts;
        
        System.out.println("--- Fare Calculation  ---");
        System.out.println("Base Fare: " + baseFare+"27842");
        System.out.println("Taxes:     " + taxes+"27842");
        System.out.println("Discounts: " + discounts+"27842");
        System.out.println("Final Fare: " + finalFare+"27842");
        
       
        return finalFare;
    
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int Entity_id=0;
	String Creation_date=null;
	String Updated_date=null;
	String airport_name=null;
	String code=null;
	String location=null;
	String airline_name=null;
	String airline_code=null;
	String Contact_email=null;
	int Flight_number=0;
	String departure=null;
	String destination=null;
	int basefare=0;
	String Pilot_name=null;
	String License_number=null;
	int Experience_years=0;
	String Crew_name=null;
	String Role=null;
	String shift=null;
	String Passenger_name=null;
	int age=0;
	String gender=null;
	int contact=0;
	String Booking_date=null;
	int Seat_number=0;
	String Travel_class=null;
	String Payment_date=null;
	String Payment_method=null;
	int Amount_paid=0;
	int Ticket_number=0;
	String IssueDate=null;
	int taxes=0;
	int discount=0;
	
	System.out.println("Enter Entity ID");
	Entity_id = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter The Creation Date");
	Creation_date = sc.nextLine();
	
	System.out.println("Enter Updated Date");
	Updated_date = sc.nextLine();
	
	System.out.println("Enter Airport Name");
	airport_name = sc.nextLine();
	
	System.out.println("Enter code");
	code = sc.nextLine();
	sc.nextLine(); 
	
	System.out.println("Enter the location");
	location = sc.nextLine();
	
	System.out.println("Enter the airline Name");
	airline_name = sc.nextLine();
	
	System.out.println("Enter the airline Code");
	airline_code = sc.nextLine();
	sc.nextLine(); 
	
	System.out.println("Enter the contact Email");
	Contact_email = sc.nextLine();
	
	System.out.println("Enter the Flight Number");
	Flight_number = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the departure location");
	departure = sc.nextLine();
	
	System.out.println("Enter the destination");
	destination = sc.nextLine();
	
	System.out.println("Enter the base fare");
    basefare = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Pilot's name");
	Pilot_name = sc.nextLine();
	
	System.out.println("Enter the License number");
	License_number = sc.nextLine();
	
	System.out.println("Enter the Experience Years");
	Experience_years = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Crew name");
	Crew_name = sc.nextLine();
	
	System.out.println("Enter the Role");
	Role = sc.nextLine();
	
	System.out.println("Enter the Shift");
	shift = sc.nextLine();
	
	System.out.println("Enter the Passenger's name");
	Passenger_name = sc.nextLine();
	
	System.out.println("Enter the age");
	age = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Gender");
	gender = sc.nextLine();

	System.out.println("Enter the contact");
	contact = sc.nextInt();
	sc.nextLine(); 
	   
	System.out.println("Enter the Taxes");
	taxes=sc.nextInt();
	sc.next();
	
	
	System.out.println("Enter the discount");
	sc.nextInt();
	
	System.out.println("\nEnter the Booking date");
	Booking_date = sc.nextLine();
	
	System.out.println("Enter The Seat Number");
	Seat_number = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Travel class");
	Travel_class = sc.nextLine();
	
	System.out.println("Enter the Payment date");
	Payment_date = sc.nextLine();
	
	System.out.println("Enter the Payment Method");
	Payment_method = sc.nextLine();
	
	System.out.println("Enter the Amount Paid");
	Amount_paid = sc.nextInt();
	
	System.out.println("Enter the Ticket Number");
	Ticket_number = sc.nextInt();
	sc.nextLine(); 
	
	System.out.println("Enter the Issue Date");
	IssueDate = sc.nextLine();
	

	Ticket tt = new Ticket(Entity_id, Creation_date, Updated_date, airport_name, code, location, airline_name, airline_code, Contact_email, Flight_number, departure, destination, basefare, 
		Pilot_name, License_number, Experience_years, Crew_name, Role, shift, Passenger_name, age, gender, contact, Booking_date, Seat_number, Travel_class, 
		Payment_date, Payment_method, Amount_paid, Ticket_number, IssueDate);
	
	tt.calculateFare(taxes, discount);
    sc.close();
}

}

