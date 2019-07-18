package com.sunchp.utils.math;

import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

/**
 * @author albert
 */
public class BigDecimalUtils {


    private BigDecimalUtils() {
    }

    public static BigDecimalLogic is(String value) {
        return new BigDecimalLogic(value);
    }

    public static BigDecimalLogic is(Number value) {
        return new BigDecimalLogic(value.toString());
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

    public static BigDecimal stringSafeGetBigDecimal(String stringNumber) {
        stringNumber = replaceAllNotDigitalCharsExceptDotAndMinusSign(stringNumber);
        if (NumberUtils.isCreatable(stringNumber)) {
            return new BigDecimal(stringNumber);
        }
        throw new NumberFormatException("Argument "+stringNumber + " is not a digital");
    }

    private static String replaceAllNotDigitalCharsExceptDotAndMinusSign(String stringNumber) {
        String symbol = AsciiSymbolContants.DISPLAY_SYMBOL + AsciiSymbolContants.NOT_DISPLAY_SYMBOL;
        symbol = RegExUtils.replaceAll(symbol, "\\-", "");
        symbol = RegExUtils.replaceAll(symbol, "\\.", "");
        stringNumber = StringUtils.replaceChars(stringNumber, symbol, "");
        return stringNumber;
    }


}
