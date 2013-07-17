import static java.util.Arrays.asList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> floorsServiced = asList(0,1,2,3,4,5,6,7,8,9);
        Elevator elevator = new Elevator(floorsServiced);
    }


}
