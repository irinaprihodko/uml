package Airport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        //один пассажир
        Passenger p1 = new Passenger(" Иван ", " Иванов ", " Россия ");
        p1.setCountry("Украина");
        //другой пассажир
        Passenger vip = new Passenger(" Петр ", " Петров ", " США ");

        //посадочный талон
        BoardingPass bp = new BoardingPass(123);
        try {
            bp.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-31"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        p1.setBp(bp);

        //полеты
        Flight flight444 = new Flight(444);
        Flight flight333 = new Flight(333);
        p1.setFlights(flight444);
        p1.setFlights(flight333);

        //аэропорт
        Airport a1 = new Airport("Борисполь");
        a1.addPassenger(p1);

        //прошлые путешествия
        p1.setCountry("Уганда");

        //output
        System.out.println(p1.getName() + "имеет гражданство страны  " + p1.getCountry());

        System.out.println("Посадочный талон действителен до  " +
                new SimpleDateFormat("yyyy-MM-dd").format(p1.getBp().getDateExpire()));

        System.out.println(p1.getName() + "летал рейсами:");
        Iterator iter = p1.getFlights().iterator();
        while (iter.hasNext()) {
            System.out.println(((Flight) iter.next()).getNumber());
        }
        System.out.println(("Едет в аэропорт ") + p1.getAirport().getName());
        System.out.println("В аропорту " + p1.getAirport().getName() + " находится" +
                p1.getAirport().getPeopleCount() + "человек");
        System.out.println("В прошлом летал рейсами в");
        Iterator<PreviousTrip> iterPreviousTrip = p1.getTrips().iterator();
        while (iterPreviousTrip.hasNext()) {
            System.out.println(((PreviousTrip) iterPreviousTrip.next()).getDestination());
        }

        Passenger passengers[] = new Passenger[10];
        passengers[0] = p1;
        passengers[1] = vip;
        Menu.showPassengers(passengers);


    }
}








