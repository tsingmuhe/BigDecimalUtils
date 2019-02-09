package com.sunchp.utils.math;

import static com.sunchp.utils.math.BigDecimalUtils.stringSafeGetBigDecimal;

import java.math.BigDecimal;

/**
 * @author albert
 */
public class BigDecimalLogic {
    private final BigDecimal amount;

    private static final int ZERO = 0;

    public BigDecimalLogic(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimalLogic(String amount) {
        if (amount == null) {
            this.amount = null;
        } else {
            this.amount = stringSafeGetBigDecimal(amount);
        }
    }

    public boolean eq(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) == ZERO;
    }

    public boolean eq(String value) {
        return eq(stringSafeGetBigDecimal(value));
    }


    public boolean eq(Number value) {
        return eq(stringSafeGetBigDecimal(value.toString()));
    }

    public boolean gt(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) > ZERO;
    }

    public boolean gt(String value) {
        return gt(stringSafeGetBigDecimal(value));
    }

    public boolean gt(Number value) {
        return gt(stringSafeGetBigDecimal(value.toString()));
    }

    public boolean gteq(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) >= ZERO;
    }

    public boolean gteq(String value) {
        return gteq(stringSafeGetBigDecimal(value));
    }

    public boolean gteq(Number value) {
        return gteq(stringSafeGetBigDecimal(value.toString()));
    }

    public boolean lt(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) < ZERO;
    }

    public boolean lt(String value) {
        return lt(stringSafeGetBigDecimal(value));
    }

    public boolean lt(Number value) {
        return lt(stringSafeGetBigDecimal(value.toString()));
    }

    public boolean lteq(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) <= ZERO;
    }

    public boolean lteq(String value) {
        return lteq(stringSafeGetBigDecimal(value));
    }

    public boolean lteq(Number value) {
        return lteq(stringSafeGetBigDecimal(value.toString()));
    }

    public boolean isZero() {
        return eq(BigDecimal.ZERO);
    }

    public boolean isNullOrZero() {
        return this.amount == null || isZero();
    }
}
