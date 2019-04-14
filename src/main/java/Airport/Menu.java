package Airport;

public class Menu {
    private static int i = 0;

    public static void showPassengers (Passenger[] passengers) {
        System.out.println("Cписок пассажиров:");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] instanceof Passenger) {
                System.out.println(passengers[i].getName() + "имеет гражданство страны  " + passengers[i].getCountry());
            }
        }

    }
}