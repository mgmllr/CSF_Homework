import java.util.Scanner;

public class ReservationSystem {

    public static void main(String[] args) {
        inputReservation();
    }

    public static void inputReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are about to create a new reservation. Enter a time:");
        String time = scanner.next();
        System.out.println("Enter a name:");
        String name = scanner.next();
        System.out.println("Enter the size of the party:");
        int people = scanner.nextInt();
        System.out.println("Enter the type of booking:");
        String type = scanner.next();
        if(type == "Phone" || type == "phone") {
            System.out.println("Enter a phone number:");
            String phone = scanner.next();
            Reservation reservation = new PhoneReservation(time, name, people, phone);
            Restaurant.addReservation(reservation);
        } else if(type == "Internet" || type == "internet") {
            System.out.println("Enter a phone number:");
            String phone = scanner.next();
            System.out.println("Enter a source website:");
            String sourceWebsite = scanner.next();
            Reservation reservation = new InternetReservation(time, name, people, phone, sourceWebsite);
            Restaurant.addReservation(reservation);
        } else if(type == "In-person" || type == "in-person") {
            Reservation reservation = new InPersonReservation(time, name, people);
            Restaurant.addReservation(reservation);
         } else {
            System.out.println("Invalid type.");
        }

    }
}
