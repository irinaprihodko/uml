package Airport;

public class PreviousTrip {
    private String destination;
    private Airport airport;

    public PreviousTrip(String destination, Airport airport) {
        this.destination = destination;
        this.airport = airport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }
}
