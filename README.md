How It Work
------------------------

## Background


### Difficult to Comprehension
```txt

BigDecimal big10 = new BigDecimal(10);
BigDecimal big20 = new BigDecimal(20);

System.out.println(big10.compareTo(big20) < -1);  // false
System.out.println(big10.compareTo(big20) <= -1); // true
System.out.println(big10.compareTo(big20) == -1); // true
System.out.println(big10.compareTo(big20) >= -1); // true
System.out.println(big10.compareTo(big20) > -1);  // false
System.out.println(big10.compareTo(big20) != -1); // false

System.out.println(big10.compareTo(big20) < 0);   // true
System.out.println(big10.compareTo(big20) <= 0);  // true
System.out.println(big10.compareTo(big20) == 0);  // false
System.out.println(big10.compareTo(big20) >= 0);  // false
System.out.println(big10.compareTo(big20) > 0);   // false
System.out.println(big10.compareTo(big20) != 0);  // true

System.out.println(big10.compareTo(big20) < 1);   // true
System.out.println(big10.compareTo(big20) <= 1);  // true
System.out.println(big10.compareTo(big20) == 1);  // false
System.out.println(big10.compareTo(big20) >= 1);  // false
System.out.println(big10.compareTo(big20) > 1);   // false
System.out.println(big10.compareTo(big20) != 1);  // true

```

### Error-prone


![傻傻分不清楚](./src/test/java/com/sunchp/utils/math/Test.java)

```
        double d = 0.1D;
        float f = 0.1F;

        Double aDouble = d;
        Float aFloat = f;

        BigDecimal correctedDoubleBigDecimal = new BigDecimal(aDouble.toString());
        BigDecimal dbigDecimal1 = new BigDecimal(d);
        BigDecimal dbigDecimal2 = new BigDecimal(aDouble);
        BigDecimal dbigDecimal3 = BigDecimal.valueOf(d);
        BigDecimal dbigDecimal4 = BigDecimal.valueOf(aDouble);
        BigDecimal correctedFloatBigDecimal = new BigDecimal(aFloat.toString());
        BigDecimal fbigDecimal1 = new BigDecimal(f);
        BigDecimal fbigDecimal2 = new BigDecimal(aFloat);
        BigDecimal fbigDecimal3 = BigDecimal.valueOf(f);
        BigDecimal fbigDecimal4 = BigDecimal.valueOf(aFloat);

        Double d01 = (double) f;

        //0.10000000149011612
        System.out.println(d01);

        //0.1
        System.out.println(correctedDoubleBigDecimal);
        //0.1000000000000000055511151231257827021181583404541015625
        System.out.println(dbigDecimal1);
        //0.1000000000000000055511151231257827021181583404541015625
        System.out.println(dbigDecimal2);
        //0.1
        System.out.println(dbigDecimal3);
        //0.1
        System.out.println(dbigDecimal4);
        //0.1
        System.out.println(correctedFloatBigDecimal);
        //0.100000001490116119384765625
        System.out.println(fbigDecimal1);
        //0.100000001490116119384765625
        System.out.println(fbigDecimal2);
        //0.10000000149011612
        System.out.println(fbigDecimal3);
        //0.10000000149011612
        System.out.println(fbigDecimal4);
        
        
```


- Import library to your code:
```
	import static com.sunchp.utils.math.BigDecimalUtils.*;
```

- Doing comparison:
```
    if(is(income).lt(amount)) {
      // ....
    }else {
      // ...
    }
```

- Do calculation:
```
    remain = cal(income).minus(amount).result();
```    

Other methods currently in this library
------------------------
```
      is(income).eq(amount);    // Equal
      is(income).gt(amount);     // Greater than
      is(income).gteq(amount);   // Greater than equal
      is(income).lt(amount);     // Less than
      is(income).lteq(amount);   // Less than equal
 
      
      cal(income).plus(amount)  // addition
      cal(income).minus(amount)   // subtraction
      cal(income).mul(amount)   // multiply
      cal(income).div(amount)   // division
      cal(income).div(amount,2)   // division
```
      
      
Currently comparison support only String and BigDecimal:
```
      is(bigdecimal).eq(bigdecimal);    // BigDecimal and BigDecimal
      is(bigdecimal).eq("1000");        // BigDecimal and String
      is("1000").lt(bigdecimal);        // String and BigDecimal
      is("1000").lt("2000");            // String and String
```
       
Calculation support only String and BigDecimal:
```
      cal(bigdecimal).minus(bigdecimal)  // BigDecimal and BigDecimal
      cal(bigdecimal).minus("500")  // BigDecimal and String
      cal("500").minus(bigdecimal)  // String and BigDecimal
      cal("1000").minus("500")      // String and String
```

## 增加功能

* 支持 所有算数类型的对比
* 如果传入String不是一个能转换为数字的 字符串 得到的结果将是0
* 支援带分隔符的数字转换  例如 +1,000,000 -1,000,000
* 去掉了Ascii码中所有符号 除了- 和 . 符号

## add feature

* Support for comparison of all arithmetic types
* If the passed String is not a string that can be converted to a number, the result will be 0
* Support for delimited numeric conversions such as +1,000,000 -1,000,000
* Removed all symbols from the Ascii code except the - and . symbol `\u002d\u002e`