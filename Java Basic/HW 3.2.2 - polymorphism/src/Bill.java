import TaxType.TaxType;

import java.math.BigDecimal;

class Bill {
    //private double amount;
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType

        //double taxAmount = 0.0;

        taxService.payOut(taxType.calculateTaxFor(amount));
    }
}