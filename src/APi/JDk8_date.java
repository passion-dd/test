package APi;

import java.time.LocalDate;

public class JDk8_date {
    public static void main(String[] args) {
//        LocalDate和LocalTime用法差不多
        LocalDate ld = LocalDate.now();//获取年-月-日
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        System.out.println(ld);
        System.out.println(year);

//        加多少时间
        LocalDate ld1 = ld.plusDays(2);
        LocalDate ld2 = ld.plusMonths(3);
        System.out.println(ld1);
        System.out.println(ld2);

//        指定日期
        LocalDate ld3 = LocalDate.of(2022, 11, 07);
        System.out.println(ld3);
    }
}
