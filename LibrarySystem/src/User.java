import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Loan> loans;

    public User(String name) {
        this.name = name;
        this.loans = new ArrayList<Loan>();
    }

    public boolean hasOverdueItems(){
        for(int i = 0; i < loans.size(); i++){
            if(loans.get(i).checkOverdue()){
                return true;
            }
        }
        return false;
    }
}
