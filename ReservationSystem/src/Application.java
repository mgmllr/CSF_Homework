import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.createLists();
        menu(restaurant);
    }

    public static void menu(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter one of the following numbers: 1 - new reservation, 2 - remove a reservation, 3 - list reservations, or 4 - quit");
            int letter = scanner.nextInt();
            switch(letter) {
                case 1: newReservation(restaurant);
                        break;
                case 2: removeReservation(restaurant);
                        break;
                case 3: listReservations(restaurant);
                        break;
                case 4: return;
            }
        }
    }

    public static void newReservation(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a time (0-23):");
        int time = scanner.nextInt();
        System.out.println("Enter a name:");
        String name = scanner.next();
        System.out.println("Enter the size of the party:");
        int people = scanner.nextInt();
        System.out.println("Enter the type of booking (internet, phone, or in-person):");
        String type = scanner.next();
        if(type.equals("phone")) {
            System.out.println("Enter a phone number:");
            String phone = scanner.next();
            restaurant.addReservation(new PhoneReservation(time, name, people, phone));
        } else if(type.equals("internet")) {
            System.out.println("Enter a phone number:");
            String phone = scanner.next();
            System.out.println("Enter a source website:");
            String sourceWebsite = scanner.next();
            Reservation reservation = new InternetReservation(time, name, people, phone, sourceWebsite);
            restaurant.addReservation(reservation);
        } else if(type.equals("in-person")) {
            Reservation reservation = new InPersonReservation(time, name, people);
            restaurant.addReservation(reservation);
        } else {
            System.out.println("Invalid type.");
        }
    }

    public static void listReservations(Restaurant restaurant) {
        for(int i = 0; i < restaurant.hours.size(); i++) {
            System.out.println("Time:" + i + "\nCustomers:" + restaurant.getCustomerCount(i) + "\n");
            for(int n = 0; n < restaurant.hours.get(i).size(); n++) {
                restaurant.hours.get(i).get(n).displayReservation();
            }
        }
    }

    public static void removeReservation(Restaurant restaurant) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the reservation you want to delete:");
        String name = scanner.next();
        System.out.println("Enter the time of the reservation you want to delete:");
        int time = scanner.nextInt();
        restaurant.removeReservation(time, name);
    }
}
