public class Magazine extends Item {
    int loanPeriod = 0;
    boolean loanable = false;
    String issue;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
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
        return issue;
    }
}
