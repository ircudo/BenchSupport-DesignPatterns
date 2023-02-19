package model;

import java.math.*;

public class EasterDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        // 25% discount
        return amount.multiply(BigDecimal.valueOf(0.75));
    }
}
