public abstract class Reservation {
    protected int time;
    protected String name;
    protected int people;
    protected String type;

    public void displayReservation(){
        System.out.println("--Name: " + this.name);
        System.out.println("--Number of People: " + this.people);
    }
}
