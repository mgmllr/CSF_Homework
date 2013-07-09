import java.util.ArrayList;

public class ReservationList {
    private static ArrayList<Reservation> list = new ArrayList<Reservation>();

    public static void addReservation(Reservation reservation) {
        list.add(reservation);
    }

    public static void removeReservation(Reservation reservation) {
        list.remove(reservation);
    }

    public static void displayList(){
        for(int i = 0; i < list.size(); i++) {
            list.get(i).displayReservation();
        }
    }
}
