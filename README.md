How It Work
------------------------
- Import library to your code:
```java
	import static com.sunchp.utils.math.BigDecimalUtils.*;
```

- Doing comparison:
```java
    if(is(income).lt(amount)) {
      // ....
    }else {
      // ...
    }
```

- Do calculation:
```java
    remain = cal(income).minus(amount).result();
```    

Other methods currently in this library
------------------------
```java
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
```java
      is(bigdecimal).eq(bigdecimal);    // BigDecimal and BigDecimal
      is(bigdecimal).eq("1000");        // BigDecimal and String
      is("1000").lt(bigdecimal);        // String and BigDecimal
      is("1000").lt("2000");            // String and String
```
       
Calculation support only String and BigDecimal:
```java
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