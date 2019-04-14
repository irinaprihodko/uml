package Airport;

import java.util.HashSet;
import java.util.Set;

public class Passenger extends Human{
    private String country;
    private BoardingPass bp ;
    private Airport airport;
    private Set <PreviousTrip> trips = new HashSet<PreviousTrip>();
    private Set<Flight> flights = new HashSet<Flight>();

    public Passenger(String name, String surname, String country) {
        super(name, surname);
        this.country = country;
    }

    public Passenger() {
            }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BoardingPass getBp() {
        return bp;
    }

    public void setBp(BoardingPass bp) {
        this.bp = bp;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Set<PreviousTrip> getTrips() {
        return trips;
    }

    public void setTrips(Set<PreviousTrip> trips) {
        this.trips = trips;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights (Flight flights) {
        flights.add() ;
    }

    public void deleteFlight(Flight f){
        flights.remove(f);
    }

    public void deleteTrip(PreviousTrip t) {
         trips.remove (t);
    }
}
