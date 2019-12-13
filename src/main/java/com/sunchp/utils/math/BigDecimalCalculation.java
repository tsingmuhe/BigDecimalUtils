package com.sunchp.utils.math;

import static com.sunchp.utils.math.BigDecimalUtils.stringSafeGetBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author albert
 */
public class BigDecimalCalculation {
    private final BigDecimal amount;

    public BigDecimalCalculation(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimalCalculation(String amount) {
        this.amount = stringSafeGetBigDecimal(amount);
    }

    public BigDecimalCalculation(Number amount) {
        this.amount = stringSafeGetBigDecimal(amount.toString());
    }

    public BigDecimalCalculation plus(BigDecimal value) {
        return new BigDecimalCalculation(this.amount.add(value));
    }

    public BigDecimalCalculation plus(String value) {
        return plus(stringSafeGetBigDecimal(value));
    }

    public BigDecimalCalculation plus(Number value) {
        return plus(stringSafeGetBigDecimal(value.toString()));
    }

    public BigDecimalCalculation minus(BigDecimal value) {
        return new BigDecimalCalculation(this.amount.subtract(value));
    }

    public BigDecimalCalculation minus(String value) {
        return minus(stringSafeGetBigDecimal(value));
    }

    public BigDecimalCalculation minus(Number value) {
        return minus(stringSafeGetBigDecimal(value.toString()));
    }

    public BigDecimalCalculation mul(BigDecimal value) {
        return new BigDecimalCalculation(this.amount.multiply(value));
    }

    public BigDecimalCalculation mul(String value) {
        return mul(stringSafeGetBigDecimal(value));
    }

    public BigDecimalCalculation mul(Number value) {
        return mul(stringSafeGetBigDecimal(value.toString()));
    }

    public BigDecimalCalculation div(BigDecimal value) {
        return new BigDecimalCalculation(this.amount.divide(value, RoundingMode.HALF_EVEN));
    }

    public BigDecimalCalculation div(String value) {
        return div(stringSafeGetBigDecimal(value));
    }

    public BigDecimalCalculation div(Number value) {
        return div(stringSafeGetBigDecimal(value.toString()));
    }

    public BigDecimalCalculation div(BigDecimal value, int scale) {
        return new BigDecimalCalculation(this.amount.divide(value, scale, RoundingMode.HALF_EVEN));
    }

    public BigDecimalCalculation div(String value, int scale) {
        return div(stringSafeGetBigDecimal(value), scale);
    }

    public BigDecimalCalculation div(Number value, int scale) {
        return div(stringSafeGetBigDecimal(value.toString()), scale);
    }

    public BigDecimal result() {
        return this.amount;
    }
}
