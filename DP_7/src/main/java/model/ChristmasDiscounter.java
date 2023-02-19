package model;

import java.math.*;

public class ChristmasDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        // 40% discount
        return amount.multiply(BigDecimal.valueOf(0.6));
    }
}
