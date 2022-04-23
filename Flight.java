package application.projectds1;

public class Flight implements Comparable<Flight> {
    private int flightNumber;
    private String airLineName;
    private String source;
    private String destination;
    private int capacity;


    public Flight ( int flightNumber, String airLineName, String source, String destination, int capacity ) {
        this.flightNumber = flightNumber;
        this.airLineName = airLineName;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getFlightNumber () {
        return flightNumber;
    }

    public void setFlightNumber ( int flightNumber ) {
        this.flightNumber = flightNumber;
    }

    public String getAirLineName () {
        return airLineName;
    }

    public void setAirLineName ( String airLineName ) {
        this.airLineName = airLineName;
    }

    public String getSource () {
        return source;
    }

    public void setSource ( String source ) {
        this.source = source;
    }

    public String getDestination () {
        return destination;
    }

    public void setDestination ( String destination ) {
        this.destination = destination;
    }

    public int getCapacity () {
        return capacity;
    }

    @Override
    public boolean equals ( Object o ) {

        return this.getFlightNumber() == ((Flight) o).getFlightNumber();
    }


    public void setCapacity ( int capacity ) {
        this.capacity = capacity;
    }

    @Override
    public String toString () {
        return "Flight{" +
                "flightNumber: " + flightNumber +
                ", airLineName: '" + airLineName + '\'' +
                ", source: '" + source + '\'' +
                ", destination: '" + destination + '\'' +
                ", capacity: " + capacity +
                '}';
    }

    @Override
    public int compareTo ( Flight o ) {
        if (this.getFlightNumber() == o.getFlightNumber()) {
            return 0;
        } else if (this.getFlightNumber() > o.getFlightNumber()) {
            return 1;
        }
        return -1;
    }
}
