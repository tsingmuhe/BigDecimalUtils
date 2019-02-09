package com.sunchp.utils.math;

import java.math.BigDecimal;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author albert
 */
public class BigDecimalUtils {


    private BigDecimalUtils() {
    }

    public static BigDecimalLogic is(BigDecimal value) {
        return new BigDecimalLogic(value);
    }

    public static BigDecimalLogic is(String value) {
        return new BigDecimalLogic(value);
    }

    public static BigDecimalLogic is(Number value) {
        return new BigDecimalLogic(value.toString());
    }

    public static BigDecimalCalculation cal(BigDecimal value) {
        return new BigDecimalCalculation(value);
    }

    public static BigDecimalCalculation cal(String value) {
        return new BigDecimalCalculation(value);
    }

    public static BigDecimalCalculation cal(Number value) {
        return new BigDecimalCalculation(value.toString());
    }


    public static BigDecimal getMinimum(BigDecimal v1, BigDecimal v2) {
        if (v1 == null) {
            return v2;
        }
        if (v2 == null) {
            return v1;
        }
        return v1.compareTo(v2) < 0 ? v1 : v2;
    }

    public static BigDecimal getMaximum(BigDecimal v1, BigDecimal v2) {
        if (v1 == null) {
            return v2;
        }
        if (v2 == null) {
            return v1;
        }
        return v1.compareTo(v2) > 0 ? v1 : v2;
    }

    public static BigDecimal stringSafeGetBigDecimal(String stringBigDecimal) {
        String symbol = AsciiSymbolContants.DISPLAY_SYMBOL + AsciiSymbolContants.NOT_DISPLAY_SYMBOL;
        symbol = RegExUtils.replaceAll(symbol, "\\-", "");
        stringBigDecimal = StringUtils.replaceChars(stringBigDecimal, symbol, "");
        return NumberUtils.isCreatable(stringBigDecimal) ?
            new BigDecimal(stringBigDecimal) : BigDecimal.ZERO;
    }
}
