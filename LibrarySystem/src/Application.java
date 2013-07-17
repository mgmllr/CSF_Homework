import java.awt.print.*;

public class Application {
    public static void main(String[] args){
        User user = new User("Maximus");
        Book book = new Book("Moby Dick", "Herman Melville");
        createLoan(user, book);
        Magazine magazine = new Magazine("Headmaster", "5");
        createLoan(user, magazine);
        DVD dvd = new DVD("Mulholland Drive", "David Lynch");
        createLoan(user, dvd);
        printUserLoans(user);
    }

    public static void createLoan(User user, Item item){
        if(!user.hasOverdueItems() && item.isLoanable() && item.loan == null){
            Loan loan = new Loan(user, item);
            user.loans.add(loan);
            item.loan = loan;
            System.out.println("Loaned " + item.title + " to " + user.name + "\n");
        } else if(user.hasOverdueItems()){
            System.out.println("Loan decline: " + user.name + " has overdue items" + "\n");
        } else if(!item.isLoanable()){
            System.out.println("Loan decline: " + item.title + " is not loanable" + "\n");
        } else if(item.loan != null){
            System.out.println("Loan decline: " + item.title + " is already on loan" + "\n");
        }
    }

    public static void returnItem(Item item){
        item.loan.user.loans.remove(item.loan);
        item.loan = null;
    }

    public static void printUserLoans(User user){
        for(int i = 0; i < user.loans.size(); i++){
            Loan loan = user.loans.get(i);
            System.out.println("Title: " + loan.item.title);
            System.out.println("On loan to " + loan.user.name + ", due back on " + loan.dueDate);
            if(loan.item instanceof Book){
                System.out.println("Author: " + loan.item.getDetail());
            } else if(loan.item instanceof Magazine){
                System.out.println("Issue: " + loan.item.getDetail());
            } else if(loan.item instanceof DVD){
                System.out.println("Director: " + loan.item.getDetail());
            }
            System.out.println();
        }
    }
}
