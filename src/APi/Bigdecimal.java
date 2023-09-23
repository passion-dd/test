package APi;

import java.math.BigDecimal;

public class Bigdecimal {
    public static void main(String[] args) {
//        解决小数运算失真问题
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b);
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
//        BigDecimal c=a1.add(b1);
        BigDecimal c = a1.subtract(b1);
//        BigDecimal c=a1.multiply(b1);
//        把BigDecimal转换成double
        double d = c.doubleValue();
        System.out.println(c);
    }
}
