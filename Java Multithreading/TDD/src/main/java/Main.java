public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit(300000, 5.4, 60);
        System.out.println("[Credit: $" + credit.getCreditTotal() + ", APR: " + credit.getCreditApr()+"%" + ", Months: " + credit.getCreditMonths()+"]");
        System.out.println("Overpayment: $" + credit.calcOverpayment());
        System.out.println("Monthly Payment: $" + credit.calcMonthlyPayment());
        System.out.println("TotalC redit: $" + credit.calcTotalCredit());

    }
}
