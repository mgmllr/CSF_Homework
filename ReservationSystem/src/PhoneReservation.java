public class PhoneReservation extends Reservation {
    private String phone;

    public PhoneReservation(int time, String name, int people, String phone) {
        this.time = time;
        this.name = name;
        this.people = people;
        this.phone = phone;
        this.type = "phone";
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("--Phone Number: " + this.phone);
        System.out.println("--Type: " + this.type + "\n");
    }

}
