public class InPersonReservation extends Reservation {

    public InPersonReservation(int time, String name, int people) {
        this.time = time;
        this.name = name;
        this.people = people;
        this.type = "In-person";
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Type:" + this.type);
    }
}
