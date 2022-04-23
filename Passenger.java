package application.projectds1;

public class Passenger implements Comparable<Passenger> {
    private int flightNumber;
    private int ticketNumber;
    private String fullName;
    private String passportNumber;
    private String Nationality;
    private String Birthdate;


    public Passenger ( int flightNumber, int ticketNumber, String fullName, String passportNumber, String nationality, String birthdate ) {
        this.flightNumber = flightNumber;
        this.ticketNumber = ticketNumber;
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        Nationality = nationality;
        Birthdate = birthdate;
    }

    public int getFlightNumber () {
        return flightNumber;
    }

    public void setFlightNumber ( int flightNumber ) {
        this.flightNumber = flightNumber;
    }

    public int getTicketNumber () {
        return ticketNumber;
    }

    public void setTicketNumber ( int ticketNumber ) {
        this.ticketNumber = ticketNumber;
    }

    public String getFullName () {
        return fullName;
    }

    public void setFullName ( String fullName ) {
        this.fullName = fullName;
    }

    public String getPassportNumber () {
        return passportNumber;
    }

    public void setPassportNumber ( String passportNumber ) {
        this.passportNumber = passportNumber;
    }

    public String getNationality () {
        return Nationality;
    }

    public void setNationality ( String nationality ) {
        Nationality = nationality;
    }

    public String getBirthdate () {
        return Birthdate;
    }

    public void setBirthdate ( String birthdate ) {
        Birthdate = birthdate;
    }

    @Override
    public boolean equals ( Object o ) {
        return this.getFullName().equals( ((Passenger) o).getFullName() );
    }

    @Override
    public String toString () {
        return "Passenger{" +
                "flightNumber: " + flightNumber +
                ", ticketNumber: " + ticketNumber +
                ", fullName: '" + fullName + '\'' +
                ", passportNumber: " + passportNumber +
                ", Nationality: '" + Nationality + '\'' +
                ", Birthdate: '" + Birthdate + '\'' +
                '}';
    }

    @Override
    public int compareTo ( Passenger o ) {
        return this.getFullName().compareTo( o.getFullName() );
    }
}
