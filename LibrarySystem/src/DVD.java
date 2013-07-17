public class DVD extends Item{
    int loanPeriod = 3;
    boolean loanable = true;
    String director;

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
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
        return director;
    }
}
