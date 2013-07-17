public class Book extends Item {
    int loanPeriod = 7;
    boolean loanable = true;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public boolean isLoanable() {
        return loanable;
    }

    public String getDetail() {
        return author;
    }
}
