package model;

import java.math.*;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
