public class Credit {
    private final int creditTotal;
    private final double creditApr;
    private final int creditMonths;

    public Credit(int creditTotal, double creditApr, int creditMonths) {
        this.creditTotal = creditTotal;
        this.creditApr = creditApr;
        this.creditMonths = creditMonths;
    }

    public int getCreditTotal() {
        return creditTotal;
    }

    public double getCreditApr() {
        return creditApr;
    }

    public int getCreditMonths() {
        return creditMonths;
    }

    public double calcOverpayment() {
        return creditTotal * creditApr / 100 * creditMonths / 12;
    }

    public double calcMonthlyPayment() {
        return calcOverpayment() / creditMonths;
    }

    public double calcTotalCredit() {
        return calcOverpayment() + creditTotal;
    }
}
