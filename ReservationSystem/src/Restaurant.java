import java.util.ArrayList;

public class Restaurant {
    private int maxCapacity = 50;
    private ArrayList<ArrayList<Reservation>> hours = new ArrayList<ArrayList<Reservation>>(24);

    public  void createLists() {
        for(int i = 0; i < 24; i++) {
            hours.set(i, new ArrayList<Reservation>());
        }
    }

    public boolean addReservation(Reservation reservation) {
        if(getCustomerCount(reservation) + reservation.people <= maxCapacity) {
            hours.get(reservation.time).add(reservation);
            return true;
        } else {
            System.out.println("We cannot accommodate your party at that time.");
            return false;
        }
    }

    public int getCustomerCount(Reservation reservation) {
        ArrayList<Reservation> reservationsPerHour = hours.get(reservation.time);
        int customerCount = 0;
        for(int i = 0; i < reservationsPerHour.size(); i++)  {
            Reservation res = reservationsPerHour.get(i);
            customerCount += res.people;
        }
        return customerCount;
    }


}
