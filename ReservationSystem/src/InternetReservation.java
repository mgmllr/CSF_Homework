import java.util.Date;

public class InternetReservation extends Reservation {
    private String sourceWebsite;
    private String phone;
    private Date createdAt;

    public InternetReservation(int time, String name, int people, String phone, String sourceWebsite) {
        this.time = time;
        this.name = name;
        this.people = people;
        this.phone = phone;
        this.sourceWebsite = sourceWebsite;
        this.type = "Internet";
        this.createdAt = new Date();
    }

    @Override
    public void displayReservation() {
        super.displayReservation();
        System.out.println("Phone Number:" + this.phone);
        System.out.println("Source Website:" + this.sourceWebsite);
        System.out.println("Created At:" + this.createdAt);
        System.out.println("Type:" + this.type);
    }
}
