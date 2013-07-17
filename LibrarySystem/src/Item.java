public abstract class Item {
    String title;
    int loanPeriod;
    boolean loanable;
    Loan loan = null;
    String detail;

    public boolean isLoanable() {
        return loanable;
    }
    public String getDetail() {
        return detail;
    }
}
