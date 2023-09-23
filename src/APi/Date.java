package APi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) throws ParseException {
//        当前时间对象
        Date a = new Date();
        System.out.println(a);

//        当前时间解析成毫秒值
        long b = a.getTime();
        System.out.println(b);

//        把时间对象和毫秒值转换成对应格式
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = s.format(a);
        String s2 = s.format(b);
        System.out.println(s1);
        System.out.println(s2);

//        字符串时间解析成日期对象
        String d = "2023-12-1 12:20:06";
        SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = d1.parse(d);
        System.out.println(d2);

    }
}
