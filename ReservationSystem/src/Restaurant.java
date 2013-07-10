import java.util.ArrayList;

public class Restaurant {
    private int maxCapacity = 50;
    public ArrayList<ArrayList<Reservation>> hours = new ArrayList<ArrayList<Reservation>>(24);

    public void createLists() {
        for(int i = 0; i < 24; i++) {
            hours.add(new ArrayList<Reservation>());
        }
    }

    public void addReservation(Reservation reservation) {
        if(getCustomerCount(reservation.time) + reservation.people <= maxCapacity) {
            hours.get(reservation.time).add(reservation);
            return;
        } else {
            System.out.println("We cannot accommodate your party at that time.");
            return;
        }
    }

    public void removeReservation(int time, String name) {
        ArrayList<Reservation> reservationsPerHour = hours.get(time);
        if(!reservationsPerHour.isEmpty()) {
            for(int i = 0; i < reservationsPerHour.size(); i++) {
                if(reservationsPerHour.get(i).name.equals(name)) {
                    reservationsPerHour.remove(i);
                    System.out.println("Reservation removed.");
                    return;
                }
            }
        }
        System.out.println("Could not find that reservation.");
        return;
    }

    public int getCustomerCount(int time) {
        ArrayList<Reservation> reservationsPerHour = hours.get(time);
        int customerCount = 0;
        if(reservationsPerHour.isEmpty()) {
            return 0;
        } else {
            for(int i = 0; i < reservationsPerHour.size(); i++)  {
                Reservation res = reservationsPerHour.get(i);
                customerCount += res.people;
            }
            return customerCount;
        }
    }

}
