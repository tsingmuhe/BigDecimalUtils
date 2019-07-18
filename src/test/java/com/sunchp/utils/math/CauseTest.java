package com.sunchp.utils.math;

import java.math.BigDecimal;

public class CauseTest {

    public static void main(String[] args) {

        System.out.println(AsciiSymbolContants.DISPLAY_SYMBOL);
        System.out.println(AsciiSymbolContants.NOT_DISPLAY_SYMBOL);

        double d = 0.1D;
        float f = 0.1F;

        Double aDouble = d;
        Float aFloat = f;

        BigDecimal correctedDoubleBigDecimal = new BigDecimal(aDouble.toString());
        BigDecimal dBigDecimal1 = new BigDecimal(d);
        BigDecimal dBigDecimal2 = new BigDecimal(aDouble);
        BigDecimal dBigDecimal3 = BigDecimal.valueOf(d);
        BigDecimal dBigDecimal4 = BigDecimal.valueOf(aDouble);
        BigDecimal correctedFloatBigDecimal = new BigDecimal(aFloat.toString());
        BigDecimal fBigDecimal1 = new BigDecimal(f);
        BigDecimal fBigDecimal2 = new BigDecimal(aFloat);
        BigDecimal fBigDecimal3 = BigDecimal.valueOf(f);
        BigDecimal fBigDecimal4 = BigDecimal.valueOf(aFloat);

        Double d01 = (double) f;

        System.out.println(d01);


        System.out.println("----");
        System.out.println("new BigDecimal(aDouble.toString()) :\n");
        System.out.println(correctedDoubleBigDecimal);
        System.out.println("----");
        System.out.println("new BigDecimal(d) : \n");
        System.out.println(dBigDecimal1);
        System.out.println("----");
        System.out.println("new BigDecimal(aDouble) :");
        System.out.println(dBigDecimal2);
        System.out.println("----");
        System.out.println("BigDecimal.valueOf(d) : ");
        System.out.println(dBigDecimal3);
        System.out.println("----");
        System.out.println("BigDecimal.valueOf(aDouble) :");
        System.out.println(dBigDecimal4);
        System.out.println("----");
        System.out.println("new BigDecimal(aFloat.toString()) : " + (fBigDecimal2.compareTo(correctedDoubleBigDecimal) != 0));
        System.out.println(correctedFloatBigDecimal);
        System.out.println("----");
        System.out.println("new BigDecimal(f) : " + (fBigDecimal2.compareTo(new BigDecimal("0.1")) < 1));
        System.out.println(fBigDecimal1);
        System.out.println("----");
        System.out.println("new BigDecimal(aFloat) : " + ((fBigDecimal2.compareTo(new BigDecimal("0.1")) > -1) && (fBigDecimal2.compareTo(new BigDecimal("0.1")) < 1)));
        System.out.println(fBigDecimal2);
        System.out.println("----");
        System.out.println("BigDecimal.valueOf(f) : " + (fBigDecimal3.compareTo(new BigDecimal("0.1")) == 0));
        System.out.println(fBigDecimal3);
        System.out.println("----");
        System.out.println("BigDecimal.valueOf(aFloat) : " + (fBigDecimal4.compareTo(BigDecimal.valueOf(0.1D)) == 0));
        System.out.println(fBigDecimal4);


    }
}
