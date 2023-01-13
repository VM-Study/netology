import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CreditTest {
    int creditTotal = 300000;
    double creditApr = 5.4;
    int creditMonths = 60;

    @Test
    public void testCalsOverpayment() {
        Credit credit = new Credit(creditTotal, creditApr, creditMonths);
        double sumOverpayment = credit.calcOverpayment();
        assertTrue(sumOverpayment == 81000, "Error sumOverpayment: " + sumOverpayment);
    }

    @Test
    public void testCalsMonthlyPayment() {
        Credit credit = new Credit(creditTotal, creditApr, creditMonths);
        double sumMonthlyPayment = credit.calcMonthlyPayment();
        assertTrue(sumMonthlyPayment == 1350, "Error sumMonthlyPayment: " + sumMonthlyPayment);
    }

    @Test
    public void testCalsTotalCredit() {
        Credit credit = new Credit(creditTotal, creditApr, creditMonths);
        double sumTotalCredit = credit.calcTotalCredit();
        assertTrue(sumTotalCredit == 381000, "Error sumTotalCredit: " + sumTotalCredit);
    }
}
