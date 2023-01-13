package TaxType;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        return amount.multiply(BigDecimal.valueOf(amount.compareTo(BigDecimal.valueOf(100000)) > 0 ? 15 : 10)).divide(BigDecimal.valueOf(100));
    }
}
