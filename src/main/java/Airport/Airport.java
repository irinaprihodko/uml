package Airport;

import java.util.HashSet;
import java.util.Set;

public class Airport implements PublicPlace{
    private String name;
    private Set<Passenger> passengers = new HashSet();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPassenger( Passenger passenger){

        passenger.setAirport(this);
        passengers.add(passenger);
    }

    public Set getPassengers(){
        return passengers;

    }
    public void removePassenger(Passenger p){
        passengers.remove(p);
    }
    public int getPeopleCount(){
        return getPassengers().size();
    }
}
