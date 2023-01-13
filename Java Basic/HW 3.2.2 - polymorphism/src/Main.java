import TaxType.IncomeTaxType;
import TaxType.ProgressiveTaxType;
import TaxType.VATaxType;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();

        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(new BigDecimal(1000), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(3000), new VATaxType(), taxService),
                new Bill(new BigDecimal(100_001), new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
