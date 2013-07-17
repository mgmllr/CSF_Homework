import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Loan {
    User user;
    Item item;
    Date createdAt = new Date();
    Date dueDate;
//    boolean isOverdue;

    public Loan(User user, Item item){
        this.user = user;
        this.item = item;
        this.dueDate = setDueDate(item);
    }

    public Date setDueDate(Item item){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(this.createdAt);
        calendar.add(Calendar.DATE, item.loanPeriod);
        Date dueDate = calendar.getTime();
        return dueDate;
    }

    public boolean checkOverdue(){
        if(dueDate.compareTo(new Date()) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
